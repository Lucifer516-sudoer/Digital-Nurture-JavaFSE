package Week1.day_19_06_2026.FactoryPattern;

public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new WordDocument(filePath);
    }
}
