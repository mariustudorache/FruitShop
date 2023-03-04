package eu.asaitec.fruitshop.product.model;



import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

}
