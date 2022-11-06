package app.food.inventario.dto;

import app.food.inventario.model.Cardex;
import app.food.inventario.model.Product;
import app.food.inventario.model.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardexProductDTO {

    private List<Product> products;
    private Cardex cardex;
}
