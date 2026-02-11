package com.myapp.techcycle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the View Orders use case.
 */

@Controller
@RequestMapping("/manager")
public class ManagerOrdersController {

    /**
     * Shows the list of all customer orders.
     */

    @GetMapping("/orders")
    public String viewOrders() {
        return "manager/orders";
    }
}
