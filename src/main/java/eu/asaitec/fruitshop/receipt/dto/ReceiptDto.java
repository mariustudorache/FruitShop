package eu.asaitec.fruitshop.receipt.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ReceiptDto {
    private String productName;
    private String  quantity;




}
