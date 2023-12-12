public class PrinterAdapter implements Device {
    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void turnOn() {
        // Логика включения принтера
    }

    @Override
    public void turnOff() {
        // Логика выключения принтера
    }

    @Override
    public void setVolume(int volume) {
        // Не применимо к принтеру, но нужно реализовать из-за интерфейса Device
    }

    public void printDocument(String document) {
        printer.print(document);
    }
}