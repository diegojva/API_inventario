package app.food.inventario.service;

import app.food.inventario.model.Cardex;
import app.food.inventario.model.Product;

import java.util.List;

public interface CardexService {

    Cardex save(Cardex cardex, List<Product> products);
}
