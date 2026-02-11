package com.myapp.techcycle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerOrdersController {

    @GetMapping("/manager/orders")
    public String viewOrders() {
        return "manager/orders";
    }
}
