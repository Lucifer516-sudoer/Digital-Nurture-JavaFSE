package week01.day04.factorymethodpattern.factorypattern.factory;

public class ExcelFactory extends DocumentFactory {
    @Override
    public BaseDocument createDocument(String filePath) {
        return new ExcelDocument(filePath);
    }
}
