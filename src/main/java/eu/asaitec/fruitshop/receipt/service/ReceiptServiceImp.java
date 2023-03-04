package eu.asaitec.fruitshop.receipt.service;

import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.product.repository.ProductRepository;
import eu.asaitec.fruitshop.receipt.model.Receipt;
import eu.asaitec.fruitshop.receipt.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ReceiptServiceImp implements ReceiptService {

    ReceiptRepository receiptRepository;
    @Override
    public List<Receipt> getAllReceipts() {
        return this.receiptRepository.findAll();
    }
}
