package com.myapp.techcycle.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Domain model representing a customer order.
 * Used to transfer order data from the database to the view layer.
 */

public class Order {


    private String orderId;
    private String paymentMethod;
    private Integer shoppingCartId;
    private String customerUsername;
    private String customerEmail;
    private String homeAddress;
    private BigDecimal totalPrice;
    private LocalDate dateOrder;

    // --- Getters and Setters ---

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public Integer getShoppingCartId() { return shoppingCartId; }
    public void setShoppingCartId(Integer shoppingCartId) { this.shoppingCartId = shoppingCartId; }

    public String getCustomerUsername() { return customerUsername; }
    public void setCustomerUsername(String customerUsername) { this.customerUsername = customerUsername; }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public String getHomeAddress() { return homeAddress; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }

    public BigDecimal getTotalPrice() { return totalPrice; }
    public void setTotalPrice(BigDecimal totalPrice) { this.totalPrice = totalPrice; }

    public LocalDate getDateOrder() { return dateOrder; }
    public void setDateOrder(LocalDate dateOrder) { this.dateOrder = dateOrder; }
}
