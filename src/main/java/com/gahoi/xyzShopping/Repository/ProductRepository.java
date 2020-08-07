package com.gahoi.xyzShopping.Repository;

import com.gahoi.xyzShopping.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
