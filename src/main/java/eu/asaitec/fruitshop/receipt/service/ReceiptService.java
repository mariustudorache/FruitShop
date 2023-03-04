package eu.asaitec.fruitshop.receipt.service;

import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.receipt.model.Receipt;

import java.util.List;


public interface ReceiptService {

    List<Receipt> getAllReceipts();


}
