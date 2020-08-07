package com.gahoi.xyzShopping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gahoi.xyzShopping.model.Product;
import com.gahoi.xyzShopping.service.ProductService;

@SpringBootApplication
public class XyzShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyzShoppingApplication.class, args);
	}
	
    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "PS5", 300.00, "https://images.app.goo.gl/ZNbqnBb4pTk4kPQi9"));
            productService.save(new Product(2L, "Adidas Shoes", 200.00, "https://images.app.goo.gl/uyPug43iw17rtzVi6"));
            productService.save(new Product(3L, "Sofa", 100.00, "https://images.app.goo.gl/gGEt7fDPm6AZqVsdA"));
            productService.save(new Product(4L, "Lenovo Ideapad 420", 5.00, "https://images.app.goo.gl/zBcp7VheYFBJ692o6"));
            productService.save(new Product(5L, "Realme 5Pro", 3.00, "https://images.app.goo.gl/6UdbZ3v6N1RYQaAE8"));
            productService.save(new Product(6L, "Rolex 58Pz", 500.00, "https://images.app.goo.gl/maSHwAymgzGoa6YZ9"));
            productService.save(new Product(7L, "One Plus Smart TV", 30.00, "https://images.app.goo.gl/BwJCBSXHLqNUMhiK8http://placehold.it/200x100"));
        };
    }

}
