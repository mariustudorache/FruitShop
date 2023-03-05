package eu.asaitec.fruitshop.receipt.mapper;

import eu.asaitec.fruitshop.receipt.dto.ReceiptDto;
import eu.asaitec.fruitshop.receipt.model.Receipt;

public class ModelToDto  implements  IMapper<ReceiptDto, Receipt>{
    @Override
    public Receipt map(ReceiptDto in) {
        Receipt receipt = new Receipt();
        receipt.setQuantity(in.getQuantity());
        receipt.setProductName(in.getProductName());
        return receipt;
    }


}
