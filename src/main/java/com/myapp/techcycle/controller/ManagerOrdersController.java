package com.myapp.techcycle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for the View Orders use case
 */

@Controller
public class ManagerOrdersController {

    /**
     *Shows the list of all customer orders
     */

    @GetMapping("/manager/orders")
    public String viewOrders() {
        return "manager/orders";
    }
}
