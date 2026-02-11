package com.myapp.techcycle.repository;

import com.myapp.techcycle.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository responsible for database access related to orders
 */

@Repository
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Returns all orders from the database
     */

    public List<Order> findAllOrders() {

        String sql = "SELECT * FROM orders ORDER BY date_order DESC";

        return jdbcTemplate.query(sql, orderRowMapper);
    }

    // Maps each row of the ResultSet to an Order object
    private final RowMapper<Order> orderRowMapper = (rs, rowNum) -> {

        Order order = new Order();
        order.setOrderId(rs.getString("order_id"));
        order.setPaymentMethod(rs.getString("payment_method"));
        order.setShoppingCartId(rs.getInt("shopping_cart_id"));
        order.setCustomerUsername(rs.getString("customer_username"));
        order.setCustomerEmail(rs.getString("customer_email"));
        order.setHomeAddress(rs.getString("home_address"));
        order.setTotalPrice(rs.getBigDecimal("total_price"));
        order.setDateOrder(rs.getDate("date_order").toLocalDate());

        return order;
    };
}
