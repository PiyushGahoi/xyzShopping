package com.gahoi.xyzShopping.service;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.validation.annotation.Validated;

import com.gahoi.xyzShopping.model.OrderProduct;

@Validated
public interface OrderProductService {

    OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}