package com.evanco.EvanWilsonU1Capstone.controller;

import com.evanco.EvanWilsonU1Capstone.model.Invoice;
import com.evanco.EvanWilsonU1Capstone.viewmodel.OrderViewModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderController {
    //@Autowired
    // service Layer here

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Invoice convertOrderToInvoice(@RequestBody @Valid OrderViewModel orderViewModel){
        System.out.println("=== Create order ====");
        return null;
    }
}
