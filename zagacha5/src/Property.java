import java.util.ArrayList;
import java.util.List;
public class Property implements Observable {
    private String address;
    private double price;
    private List<Observer> observers;

    public Property(String address, double price) {
        this.address = address;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(address, price);
        }
    }
}
