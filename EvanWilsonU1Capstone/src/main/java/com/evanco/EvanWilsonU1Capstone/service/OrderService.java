package com.evanco.EvanWilsonU1Capstone.service;

import com.evanco.EvanWilsonU1Capstone.dao.*;
import com.evanco.EvanWilsonU1Capstone.model.*;
import com.evanco.EvanWilsonU1Capstone.viewmodel.OrderViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class OrderService {

    // Field injection
    InvoiceDao invoiceDao;
    SalesTaxDao salesTaxDao;
    ProcessingFeeDao processingFeeDao;
    GameDao gameDao;
    ConsoleDao consoleDao;
    TshirtDao tshirtDao;

    // Constructor injection
    @Autowired
    public OrderService(InvoiceDao invoiceDao, SalesTaxDao salesTaxDao, ProcessingFeeDao processingFeeDao,
                        GameDao gameDao, ConsoleDao consoleDao, TshirtDao tshirtDao) {
        this.invoiceDao = invoiceDao;
        this.salesTaxDao = salesTaxDao;
        this.processingFeeDao = processingFeeDao;
        this.gameDao = gameDao;
        this.consoleDao = consoleDao;
        this.tshirtDao = tshirtDao;
    }

    // -------------------------------------------------------
    // Service methods
    // -------------------------------------------------------
    @Transactional
    public Invoice saveOrder(OrderViewModel ovm) {
        /*
         This is where we convert the OrderViewModel input to an Invoice object and
         return the invoice to the user
         */

        // Instantiate new Invoice
        Invoice invoice = new Invoice();

        // Set name
        invoice.setName(ovm.getName());

        // Set street
        invoice.setStreet(ovm.getStreet());

        // Set city
        invoice.setCity(ovm.getCity());

        // Set and validate state
        List<SalesTaxRate> states = salesTaxDao.getAllStates();
        for (int i = 0; i < states.size(); i++) {
            if (!ovm.getState().toUpperCase().equals(states.get(i).getState())) {
                continue;
            }
            if (ovm.getState().toUpperCase().equals(states.get(i).getState())) {
                invoice.setState(states.get(i).getState().toUpperCase());
                break;
            }
        }

        // Set zipcode
        invoice.setZipcode(ovm.getZipcode());

        // Set item_type
        invoice.setItem_type(ovm.getItem_type().toLowerCase());

        // Set item_id
        invoice.setItem_id(ovm.getItem_id());

        // Set purchase quantity
        if (ovm.getQuantity() > 0) {
            invoice.setQuantity(ovm.getQuantity());
        } else {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        // Set unit_price, subtotal, and update existing quantities
        BigDecimal price;
        int availableQty;
        int newQty = 0;
        // Using switch case here for variable item_types
        switch (ovm.getItem_type().toLowerCase()) {
            case "game": {
                if(gameDao.getGameById(ovm.getItem_id()) == null){
                    throw new NullPointerException("ID " + ovm.getItem_id() + " does not exist in " + ovm.getItem_type() + " table");
                }
                price = gameDao.getGameById(ovm.getItem_id()).getPrice();
                invoice.setItem_type("Game"); // sanitize data to match db
                invoice.setUnit_price(price);
                invoice.setSubtotal(price.multiply(new BigDecimal(invoice.getQuantity())).setScale(2, RoundingMode.HALF_UP));

                // Compare available qty and requested qty
                availableQty = gameDao.getGameById(ovm.getItem_id()).getQuantity();
                if (ovm.getQuantity() > availableQty) {
                    throw new IllegalArgumentException("Uh oh, looks like we have  " + availableQty + " in stock!");
                } else {
                    // Adjust dao as necessary to reflect recent purchase
                    newQty = availableQty - ovm.getQuantity();
                    Game updatedGame = gameDao.getGameById(ovm.getItem_id());
                    updatedGame.setQuantity(newQty);
                    gameDao.updateGame(updatedGame);
                }
                break;
            }
            case "console": {
                if(consoleDao.getConsoleById(ovm.getItem_id()) == null){
                    throw new NullPointerException("ID " + ovm.getItem_id() + " does not exist in " + ovm.getItem_type() + " table");
                }
                price = consoleDao.getConsoleById(ovm.getItem_id()).getPrice();
                invoice.setItem_type("Console"); // sanitize data to match db
                invoice.setUnit_price(price);
                invoice.setSubtotal(price.multiply(new BigDecimal(invoice.getQuantity())).setScale(2, RoundingMode.HALF_UP));

                // Compare available qty and requested qty
                availableQty = consoleDao.getConsoleById(ovm.getItem_id()).getQuantity();
                if (ovm.getQuantity() > availableQty) {
                    throw new IllegalArgumentException("Uh oh, looks like we have  " + availableQty + " in stock!");
                } else {
                    // Adjust dao as necessary to reflect recent purchase
                    newQty = availableQty - ovm.getQuantity();
                    Console updatedConsole = consoleDao.getConsoleById(ovm.getItem_id());
                    updatedConsole.setQuantity(newQty);
                    consoleDao.updateConsole(updatedConsole);
                }
                break;
            }
            case "t-shirt": {
                if(tshirtDao.getTshirtById(ovm.getItem_id()) == null){
                    throw new NullPointerException("ID " + ovm.getItem_id() + " does not exist in " + ovm.getItem_type() + " table");
                }
                price = tshirtDao.getTshirtById(ovm.getItem_id()).getPrice();
                invoice.setItem_type("T-Shirt"); // sanitize data to match db
                invoice.setUnit_price(price);
                invoice.setSubtotal(price.multiply(new BigDecimal(invoice.getQuantity())).setScale(2, RoundingMode.HALF_UP));

                // Compare available qty and requested qty
                availableQty = tshirtDao.getTshirtById(ovm.getItem_id()).getQuantity();
                if (ovm.getQuantity() > availableQty) {
                    throw new IllegalArgumentException("Uh oh, looks like we have  " + availableQty + " in stock!");
                } else {
                    // Adjust dao as necessary to reflect recent purchase
                    newQty = availableQty - ovm.getQuantity();
                    Tshirt updatedTshirt = tshirtDao.getTshirtById(ovm.getItem_id());
                    updatedTshirt.setQuantity(newQty);
                    tshirtDao.updateTshirt(updatedTshirt);
                }
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected value [ " + ovm.getItem_type() +
                        " ] : Check your spelling. Acceptable Entries: Game, Console, T-shirt (not case sensitive)");
        }

        // Set tax
        if (salesTaxDao.calculateTax(invoice.getState()) != null) {
            invoice.setTax(
                    salesTaxDao.calculateTax(invoice.getState())
                            .multiply(invoice.getSubtotal())
                            .setScale(2, RoundingMode.HALF_UP)
            );
        } else {
            throw new IllegalArgumentException("Enter a valid state code: " + ovm.getState().toUpperCase() + " does not exist");
        }

        // Set processing fee
        // Handle processing fee for orders over 10 items
        if (invoice.getQuantity() <= 10) {
            invoice.setProcessing_fee(
                    processingFeeDao.processingFee(invoice.getItem_type())
            );
        } else {
            invoice.setProcessing_fee(
                    processingFeeDao
                            .processingFee(invoice.getItem_type())
                            .add(new BigDecimal("15.49").setScale(2, RoundingMode.HALF_UP))
            );
            System.out.println("** $15.49 processing fee added **");
        }

        // Set total
        BigDecimal total = invoice.getSubtotal().add(invoice.getTax()).add(invoice.getProcessing_fee());
        if (total.compareTo(new BigDecimal("999.99")) < 0){
            invoice.setTotal(total.setScale(2, RoundingMode.HALF_UP));
        }else {
            throw new IllegalArgumentException("Your order total of $" + total + " has exceeded the maximum purchase amount of $999.99");
        }

        // Add invoice to db
        invoice = invoiceDao.addInvoice(invoice);

        return invoice;

    }

    public List<Invoice> getAllInvoices() {
        return invoiceDao.getAllInvoices();
    }

    // -------------------------------------------------------
    // BuildViewModel helper methods
    // -------------------------------------------------------
    public OrderViewModel buildOrderViewModel(Invoice invoice) {
        OrderViewModel ovm = new OrderViewModel();
        ovm.setItem_id(invoice.getItem_id());
        ovm.setName(invoice.getName());
        ovm.setStreet(invoice.getStreet());
        ovm.setState(invoice.getState());
        ovm.setZipcode(invoice.getZipcode());
        ovm.setItem_type(invoice.getItem_type());
        ovm.setItem_id(invoice.getItem_id());
        ovm.setQuantity(invoice.getQuantity());
        return ovm;
    }
}
