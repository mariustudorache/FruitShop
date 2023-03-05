package eu.asaitec.fruitshop.receipt.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "receipts")
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "product_name")
        private String productName;

        @Column(name = "quantity")
        private String quantity;


        public Receipt(String product, String quantity) {
                this.productName = product;
                this.quantity = quantity;
        }
}
