package app.food.inventario.service.impl;

import app.food.inventario.model.Cardex;
import app.food.inventario.model.Product;
import app.food.inventario.repository.CardexRepository;
import app.food.inventario.repository.ProductRepository;
import app.food.inventario.service.CardexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CardexServiceImpl implements CardexService {

    @Autowired
    private CardexRepository repoCardex;

    @Autowired
    private ProductRepository repoProduct;

    @Transactional
    @Override
    public Cardex save(Cardex cardex, List<Product> products) {
        repoCardex.save(cardex);

        products.forEach(prod -> repoProduct.saveProduct(cardex.getIdCardex(), prod.getName(), prod.getCategory()));
        return cardex;
    }
}

