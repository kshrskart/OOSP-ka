public class DeliveryOrderProcessing extends AbstractOrderProcessing {
    @Override
    protected void confirmOrder() {
        // Пустая реализация, так как этот этап не требуется для доставки заказа
    }

    @Override
    protected void packOrder() {
        // Пустая реализация, так как этот этап не требуется для доставки заказа
    }

    @Override
    protected void deliverOrder() {
        System.out.println("Order delivered");
    }
}
