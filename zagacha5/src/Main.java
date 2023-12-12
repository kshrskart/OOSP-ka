public class Main {
    public static void main(String[] args) {
        Property property1 = new Property("123 Main St", 200000);
        Property property2 = new Property("456 Elm St", 300000);

        User user1 = new User("John");
        User user2 = new User("Alice");

        property1.addObserver(user1);
        property2.addObserver(user1);
        property2.addObserver(user2);

        property1.setPrice(210000);
        property2.setPrice(320000);
    }
}