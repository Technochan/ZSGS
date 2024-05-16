package java_assignment_12_Abstract_classes_and_abstract_methods.document;

// Create 'Document' abstract class. Create subclasses like PDFDocument, TextDocument, ImageDocument, etc. Create abstract methods and concrete methods and demonstrate how they work.

import java_assignment_12_Abstract_classes_and_abstract_methods.document.abstractclasses.Document;
import java_assignment_12_Abstract_classes_and_abstract_methods.document.imagedocument.ImageDocument;
import java_assignment_12_Abstract_classes_and_abstract_methods.document.pdf_document.PdfDocument;
import java_assignment_12_Abstract_classes_and_abstract_methods.document.textdocument.TextDocument;

public class DocumentMain {
    public static void main(String[] args) {
        Document document ;
        document = new ImageDocument("image.JPG","20KB","chan");
        System.out.println(document.getDetails());

        document = new TextDocument("hello.txt","1MB","Shan");
        System.out.println(document.getDetails());

        document = new PdfDocument("notes.pdf","10MB","dhilip");
        System.out.println(document.getDetails());
    }
}
