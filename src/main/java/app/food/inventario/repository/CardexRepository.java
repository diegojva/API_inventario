package app.food.inventario.repository;

import app.food.inventario.model.Cardex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardexRepository extends JpaRepository<Cardex, Integer> {
}
