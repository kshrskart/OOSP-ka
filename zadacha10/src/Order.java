class Order {
    private Cart cart;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public void checkout() {
        // Process the order and payment
        System.out.println("Заказ был размещен");
    }
}
