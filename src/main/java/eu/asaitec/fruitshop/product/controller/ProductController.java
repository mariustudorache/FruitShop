package eu.asaitec.fruitshop.product.controller;


import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {

    ProductService productService;

    @GetMapping
    List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }
}
