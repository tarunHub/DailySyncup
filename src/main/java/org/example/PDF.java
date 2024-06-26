package org.example;


import org.apache.pdfbox.multipdf.PDFMergerUtility;
        import org.apache.pdfbox.pdmodel.PDDocument;

        import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PDF {
    public static void main(String[] args) throws FileNotFoundException {
        // Paths to the PDF files to be merged
        String pdf1 = "C:\\Users\\tarun.gupta2\\Desktop\\Citizenship\\yuvaanPassport\\IMG_20240625_0003.pdf";
        String pdf2 = "C:\\Users\\tarun.gupta2\\Desktop\\Citizenship\\yuvaanPassport\\IMG_20240625_0004.pdf";
        String pdf3 = "C:\\Users\\tarun.gupta2\\Desktop\\Citizenship\\yuvaanPassport\\pages.pdf";
        String mergedPDF = "C:\\Users\\tarun.gupta2\\Desktop\\Citizenship\\yuvaanPassport\\QuestradeRESPGovt.pdf";

        // Create PDFMergerUtility instance
        PDFMergerUtility merger = new PDFMergerUtility();

        // Set the destination file
        merger.setDestinationFileName(mergedPDF);

        // Add source files
        merger.addSource(new File(pdf1));
        merger.addSource(new File(pdf2));
        merger.addSource(new File(pdf3));

        // Merge the documents
        try {
            merger.mergeDocuments(null);
            System.out.println("PDFs merged successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
