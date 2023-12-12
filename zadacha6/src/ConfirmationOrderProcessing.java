public class ConfirmationOrderProcessing extends AbstractOrderProcessing {
    @Override
    protected void confirmOrder() {
        System.out.println("Order confirmed");
    }

    @Override
    protected void packOrder() {
        // Пустая реализация, так как этот этап не требуется для подтверждения заказа
    }

    @Override
    protected void deliverOrder() {
        // Пустая реализация, так как этот этап не требуется для подтверждения заказа
    }
}

