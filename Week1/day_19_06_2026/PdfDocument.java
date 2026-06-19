package Week1.day_19_06_2026;

public class PdfDocument implements Document {
    private String filePath;

    public PdfDocument(String filePath) {
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
        if (this.filePath.endsWith(".pdf") == true)
            return true;
        return false;
    }

}
