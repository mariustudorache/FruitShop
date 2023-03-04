package eu.asaitec.fruitshop.product.repository;

import eu.asaitec.fruitshop.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
