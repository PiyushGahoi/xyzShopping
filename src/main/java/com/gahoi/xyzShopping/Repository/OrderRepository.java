package com.gahoi.xyzShopping.Repository;

import org.springframework.data.repository.CrudRepository;

import com.gahoi.xyzShopping.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
