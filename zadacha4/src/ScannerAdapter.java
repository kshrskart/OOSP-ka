//Реализуйте систему для интеграции с разными видами оборудования для печати (принтеры, сканеры) с использованием адаптеров
public class ScannerAdapter implements Device {
    private Scanner scanner;

    public ScannerAdapter(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void turnOn() {
        // Логика включения сканера
    }

    @Override
    public void turnOff() {
        // Логика выключения сканера
    }

    @Override
    public void setVolume(int volume) {
        // Не применимо к сканеру, но нужно реализовать из-за интерфейса Device
    }

    public String scanDocument() {
        return scanner.scan();
    }
}