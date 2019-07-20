package com.evanco.EvanWilsonU1Capstone.service;

import com.evanco.EvanWilsonU1Capstone.model.Invoice;
import com.evanco.EvanWilsonU1Capstone.viewmodel.OrderViewModel;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // Dependency injection
    // Constructor injection
    // -------------------------------------------------------
    // Service methods
    // -------------------------------------------------------

    // -------------------------------------------------------
    // BuildViewModel helper methods
    // -------------------------------------------------------
    public OrderViewModel buildOrderViewModel(Invoice invoice){
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
