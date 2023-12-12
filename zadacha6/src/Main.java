//Реализуйте систему для обработки заказов в интернет-магазине, где разные этапы обработки заказа (подтверждение, упаковка, доставка) используют общий шаблонный метод
public class Main {
    public static void main(String[] args) {
        AbstractOrderProcessing confirmationProcessing = new ConfirmationOrderProcessing();
        confirmationProcessing.processOrder();

        AbstractOrderProcessing packagingProcessing = new PackagingOrderProcessing();
        packagingProcessing.processOrder();

        AbstractOrderProcessing deliveryProcessing = new DeliveryOrderProcessing();
        deliveryProcessing.processOrder();
    }
}