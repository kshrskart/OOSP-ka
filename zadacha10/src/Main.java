import java.util.ArrayList;
import java.util.List;
//Реализуйте паттерн "Фасад" для системы управления заказами в интернет-магазине, позволяющий покупателям просматривать товары, добавлять их в корзину и оформлять заказ
public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        Product product1 = new Product("телефон", 500.0);
        Product product2 = new Product("ноутбук", 1000.0);

        orderFacade.addProductToCart(product1);
        orderFacade.addProductToCart(product2);

        List<Product> cartProducts = orderFacade.getCartProducts();
        System.out.println("Товары в корзине: " + cartProducts.size());

        orderFacade.placeOrder();
    }
}