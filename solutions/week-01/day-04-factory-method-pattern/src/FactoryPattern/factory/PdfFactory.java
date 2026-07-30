package week01.day04.factorymethodpattern.factorypattern.factory;

public class PdfFactory extends DocumentFactory {
    @Override
    public BaseDocument createDocument(String filePath) {
        return new PdfDocument(filePath);
    }
}
