package com.gahoi.xyzShopping.service;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.validation.annotation.Validated;

import com.gahoi.xyzShopping.model.Order;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}