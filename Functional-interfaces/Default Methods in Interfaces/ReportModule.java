interface ReportExporter {
    void exportToCSV(String data);
    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println(" Exporting data to JSON: { \"report\": \"" + data + "\" }");
    }
}

class CSVExporter implements ReportExporter {
    public void exportToCSV(String data) {
        System.out.println(" Exporting data to CSV: " + data);
    }

    public void exportToPDF(String data) {
        System.out.println(" Exporting data to PDF: " + data);
    }
}

class PDFExporter implements ReportExporter {
    public void exportToCSV(String data) {
        System.out.println(" Exporting data to CSV: " + data);
    }

    public void exportToPDF(String data) {
        System.out.println(" Exporting data to PDF: " + data);
    }

    public void exportToJSON(String data) {
        System.out.println(" Custom JSON export: { \"pdfReport\": \"" + data + "\" }");
    }
}

public class ReportModule {
    public static void main(String[] args) {
        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();

        csv.exportToCSV("Sales Q3");
        csv.exportToJSON("Sales Q3");

        pdf.exportToPDF("Inventory Report");
        pdf.exportToJSON("Inventory Report");
    }
}