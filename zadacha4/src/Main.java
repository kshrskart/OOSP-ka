
public class Main {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        Device printerDevice = new PrinterAdapter(basicPrinter);

        printerDevice.turnOn();
        ((PrinterAdapter) printerDevice).printDocument("Sample document");
        printerDevice.turnOff();

        Scanner basicScanner = new BasicScanner();
        Device scannerDevice = new ScannerAdapter(basicScanner);

        scannerDevice.turnOn();
        String scannedDocument = ((ScannerAdapter) scannerDevice).scanDocument();
        System.out.println(scannedDocument);
        scannerDevice.turnOff();
    }
}