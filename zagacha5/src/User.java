public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String property, double price) {
        System.out.println(name + " received notification: Price for property at " + property + " has been updated to " + price);
    }
}
