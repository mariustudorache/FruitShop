package eu.asaitec.fruitshop.receipt.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ReceiptDto {
    private String productName;
    private String  quantity;




}
