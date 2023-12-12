public class PackagingOrderProcessing extends AbstractOrderProcessing {
    @Override
    protected void confirmOrder() {
        // Пустая реализация, так как этот этап не требуется для упаковки заказа
    }

    @Override
    protected void packOrder() {
        System.out.println("Order packed");
    }

    @Override
    protected void deliverOrder() {
        // Пустая реализация, так как этот этап не требуется для упаковки заказа
    }
}