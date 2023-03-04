package eu.asaitec.fruitshop.receipt.repository;

import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.receipt.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
