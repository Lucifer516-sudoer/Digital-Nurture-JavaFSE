package Week1.day_19_06_2026;

public class ExcelDocument implements Document {
    private String filePath;

    public ExcelDocument(String filePath) {
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
        if (this.filePath.endsWith(".xls") || this.filePath.endsWith(".xlsx"))
            return true;
        return false;
    }
}
