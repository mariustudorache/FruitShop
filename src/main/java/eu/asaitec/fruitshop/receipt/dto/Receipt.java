package eu.asaitec.fruitshop.receipt.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Receipt {
    private String productName;
    private String quantity;



}
