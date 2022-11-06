package app.food.inventario.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cardex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCardex;

    @JsonManagedReference
    @OneToMany(mappedBy = "cardex", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "id_warehouse",  foreignKey = @ForeignKey(name = "FK_WAREHOUSE_CARDEX"))
    private Warehouse warehouse;

    private LocalDateTime admissionDate;

    private LocalDateTime departureDate;

    private String operationType;

    private Integer stock;
}
