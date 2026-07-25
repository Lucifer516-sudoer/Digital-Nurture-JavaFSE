package week01.day04.factorymethodpattern.factorypattern;

public abstract class DocumentFactory {
    public abstract Document createDocument(String filePath);

    public boolean openAndVerify(String filePath) {
        Document doc = this.createDocument(filePath);
        System.out.println("Factory verifying the Document ...");
        return doc.openDocument();
    }
}
