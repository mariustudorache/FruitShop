package eu.asaitec.fruitshop.receipt.controller;


import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.product.service.ProductService;
import eu.asaitec.fruitshop.receipt.model.Receipt;
import eu.asaitec.fruitshop.receipt.service.ReceiptService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/receipts")
public class ReceiptController {

    ReceiptService receiptService;

    @GetMapping
    List<Receipt> getAllProducts(){
        return this.receiptService.getAllReceipts();
    }
}
