package week01.day04.factorymethodpattern.factorypattern.factory;

public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new WordDocument(filePath);
    }
}
