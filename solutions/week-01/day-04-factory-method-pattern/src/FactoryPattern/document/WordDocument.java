package week01.day04.factorymethodpattern.factorypattern.document;

public class WordDocument implements Document {
    private String filePath;

    public WordDocument(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean openDocument() {
        if (this.getFilePath().endsWith(".doc") || this.getFilePath().endsWith(".docx"))
            return true;
        return false;
    }

}
