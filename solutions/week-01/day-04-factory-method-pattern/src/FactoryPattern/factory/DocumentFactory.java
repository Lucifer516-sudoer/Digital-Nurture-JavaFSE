package week01.day04.factorymethodpattern.factorypattern.factory;

public abstract class DocumentFactory {
    public abstract BaseDocument createDocument(String filePath);

    public boolean openAndVerify(String filePath) {
        BaseDocument doc = this.createDocument(filePath);
        System.out.println("Factory verifying the Document ...");
        return doc.openDocument();
    }
}
