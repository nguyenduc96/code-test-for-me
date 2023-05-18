package pdf;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class Main {
    public static void main(String[] args) {
        PdfDocument pdfDocument = new PdfDocument();
        System.out.println("start");
        pdfDocument.loadFromFile("C:\\Users\\Admin\\Downloads\\Telegram Desktop\\1000+ từ vựng thường gặp nhất trong TOEIC.pdf");
        pdfDocument.saveToFile("D:\\DUC-NGUYEN\\WORK\\FOR-ME\\1000+ từ vựng thường gặp nhất trong TOEIC.doc", FileFormat.DOC);
        System.out.println("end");
        pdfDocument.close();
    }
}
