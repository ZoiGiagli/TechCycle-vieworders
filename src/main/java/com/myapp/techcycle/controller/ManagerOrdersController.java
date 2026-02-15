package com.myapp.techcycle.controller;

import com.myapp.techcycle.model.Order;
import com.myapp.techcycle.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * Controller for the View Orders use case.
 */

@Controller
@RequestMapping("/manager")
public class ManagerOrdersController{

    private final OrderService orderService;


    public ManagerOrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Displays the Manager's home page
     *
     */
    @GetMapping("/managerHome")
    public String managerHome() {
        return "manager/managerHome";
    }


    /**
     * Displays all customer orders
     */

    @GetMapping("/orders")
    public String viewOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);

        return "manager/orders";

    }
}
