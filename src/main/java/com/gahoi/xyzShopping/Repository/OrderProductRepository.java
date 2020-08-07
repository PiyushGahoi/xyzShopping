package com.gahoi.xyzShopping.Repository;

import org.springframework.data.repository.CrudRepository;

import com.gahoi.xyzShopping.model.OrderProduct;
import com.gahoi.xyzShopping.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
