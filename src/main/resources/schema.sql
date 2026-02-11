DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
                        order_id VARCHAR(36) PRIMARY KEY,
                        payment_method VARCHAR(50) NOT NULL,
                        shopping_cart_id BIGINT NOT NULL,
                        customer_username VARCHAR(50) NOT NULL,
                        customer_email VARCHAR(120),
                        home_address VARCHAR(200),
                        total_price DECIMAL(10,2) NOT NULL,
                        date_order DATE NOT NULL
);
