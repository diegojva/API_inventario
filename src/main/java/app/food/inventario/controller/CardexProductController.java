package app.food.inventario.controller;


import app.food.inventario.dto.CardexProductDTO;
import app.food.inventario.model.Cardex;
import app.food.inventario.model.Product;
import app.food.inventario.model.Warehouse;
import app.food.inventario.service.CardexService;
import app.food.inventario.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cardex-product")
public class CardexProductController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CardexService serviceCardex;

    @Autowired
    private ProductService serviceProduct;

    @PostMapping
    public ResponseEntity<Cardex> save(@RequestBody CardexProductDTO cardexDTO){
        List<Product> products = mapper.map(cardexDTO.getProducts(), new TypeToken<List<Product>>(){}.getType());

        Cardex cardex = mapper.map(cardexDTO.getCardex(), Cardex.class);

        Cardex newCardex = serviceCardex.save(cardex, products);

        return new ResponseEntity<Cardex>(newCardex, HttpStatus.CREATED);

    }
}
