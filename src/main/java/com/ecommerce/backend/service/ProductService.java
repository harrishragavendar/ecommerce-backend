package com.ecommerce.backend.service;

import com.ecommerce.backend.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    Product p1 = new Product(1, "Laptop", 35000);
    Product p2 = new Product(2, "iPhone", 90000);
    Product p3 = new Product(3, "Camera", 50000);
    List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3));


    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
