import java.util.ArrayList;
import java.util.List;
class OrderFacade {
    private List<Product> products = new ArrayList<>();
    private Cart cart = new Cart();

    public void addProductToCart(Product product) {
        cart.addProduct(product);
        System.out.println(product.getName() + " был добавлен в корзину");
    }

    public List<Product> getCartProducts() {
        return cart.getProducts();
    }

    public void placeOrder() {
        Order order = new Order(cart);
        order.checkout();
    }
}