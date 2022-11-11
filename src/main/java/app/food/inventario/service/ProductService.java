package app.food.inventario.service;

import app.food.inventario.model.Product;

public interface ProductService {

    Product save(Product product);

    Product findProductById(Long id);
}
