package app.food.inventario.service.impl;

import app.food.inventario.model.Product;
import app.food.inventario.repository.ProductRepository;
import app.food.inventario.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }
}
