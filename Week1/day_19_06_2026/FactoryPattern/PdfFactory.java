package Week1.day_19_06_2026.FactoryPattern;

public class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new PdfDocument(filePath);
    }
}
