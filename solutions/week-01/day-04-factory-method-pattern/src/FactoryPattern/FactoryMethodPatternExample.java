// Exercise 2: Implementing the Factory Method Pattern
// Scenario:
// You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.
// Steps:
// - Create a New Java Project:
// - Create a new Java project named FactoryMethodPatternExample.
// - Define Document Classes:
// - Create interfaces or abstract classes for different document types such as WordDocument, PdfDocument, and ExcelDocument.
// - Create Concrete Document Classes:
// - Implement concrete classes for each document type that implements or extends the above interfaces or abstract classes.
// - Implement the Factory Method:
// - Create an abstract class DocumentFactory with a method createDocument().
// - Create concrete factory classes for each document type that extends DocumentFactory and implements the createDocument() method.
// - Test the Factory Method Implementation:
// - Create a test class to demonstrate the creation of different document types using the factory method.

package week01.day04.factorymethodpattern.factorypattern;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        String pdfFilePath = "Java FSE\\DN 5.0-Deepskilling-Handbook-Java-FSE-Angular.pdf";
        String wordFilePath = "Java FSE\\Deepskilling\\Engineering concepts\\Design Patterns and Principles.docx";
        String excelFilePath = "Java FSE\\Deepskilling\\DN - Java FSE Mandatory hands-on detail.xlsx";

        DocumentFactory pdfCreator = new PdfFactory();
        DocumentFactory wordCreator = new WordFactory();
        DocumentFactory excelCreator = new ExcelFactory();

        System.out.println("Testing the FactoryMethod pattern,");

        Document[] docs = {
                pdfCreator.createDocument(pdfFilePath),
                wordCreator.createDocument(wordFilePath),
                excelCreator.createDocument(excelFilePath),

        };
        System.out.println("Created Documents for the supported Document types");

        for (Document each : docs) {
            System.out.println("Opened document: " + each.openDocument());
        }

    }
}