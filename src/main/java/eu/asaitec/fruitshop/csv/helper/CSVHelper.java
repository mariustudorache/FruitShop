package eu.asaitec.fruitshop.csv.helper;

import eu.asaitec.fruitshop.receipt.mapper.ModelToDto;
import eu.asaitec.fruitshop.receipt.dto.ReceiptDto;
import eu.asaitec.fruitshop.receipt.model.Receipt;

import lombok.AllArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "PRODUCT, QUANTITY"};
    
    private static final ModelToDto modelToDto = null;

   

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Receipt> csvToReceipts(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Receipt> Receipts = new ArrayList<>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
//                Receipt Receipt = new Receipt(
//                        csvRecord.get("PRODUCT"),
//                        csvRecord.get("QUANTITY")
//                );

                ReceiptDto receiptDto = new ReceiptDto( 
                        csvRecord.get("PRODUCT"),
                       csvRecord.get("QUANTITY"));
                Receipt Receipt = modelToDto.map(receiptDto);

                Receipts.add(Receipt);
            }

            return Receipts;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}
