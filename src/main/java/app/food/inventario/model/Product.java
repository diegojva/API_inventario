package app.food.inventario.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_cardex", nullable = false, foreignKey = @ForeignKey(name = "FK_CARDEX_PRODUCT"))
    private Cardex cardex;

    private String name;

    private String category;
}
