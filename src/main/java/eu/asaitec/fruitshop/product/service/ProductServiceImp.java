package eu.asaitec.fruitshop.product.service;

import eu.asaitec.fruitshop.product.model.Product;
import eu.asaitec.fruitshop.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService{

    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }
}
