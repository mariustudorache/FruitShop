package eu.asaitec.fruitshop.csv.service;

import eu.asaitec.fruitshop.csv.helper.CSVHelper;
import eu.asaitec.fruitshop.receipt.dto.Receipt;
import eu.asaitec.fruitshop.receipt.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class CSVService {

    ReceiptRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Receipt> receipts = CSVHelper.csvToReceipts(file.getInputStream());
//            repository.saveAll(receipts);
            System.out.println(receipts);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }


}