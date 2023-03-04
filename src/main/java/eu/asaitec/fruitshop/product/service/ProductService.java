package eu.asaitec.fruitshop.product.service;

import eu.asaitec.fruitshop.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAllProduct();


}
