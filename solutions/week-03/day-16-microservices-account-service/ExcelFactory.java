package week01.day04.factorymethodpattern.factorypattern;

public class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new ExcelDocument(filePath);
    }
}
