package week01.day04.factorymethodpattern.factorypattern;

public class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new PdfDocument(filePath);
    }
}
