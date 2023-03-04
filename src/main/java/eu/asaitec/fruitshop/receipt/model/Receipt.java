package eu.asaitec.fruitshop.receipt.model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "receipts")
public class Receipt {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "product_name")
        private String productName;

        @Column(name = "quantity")
        private BigDecimal quantity;



}
