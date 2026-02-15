package com.myapp.techcycle.service;

import com.myapp.techcycle.model.Order;
import com.myapp.techcycle.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

/**
 * Order Service Class.
 * Provides business logic for orders.
 */

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Returns all orders.
     * In case of a database error returns an empty list.
     */

    public List<Order> getAllOrders() {
        try {
            return orderRepository.findAllOrders();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
