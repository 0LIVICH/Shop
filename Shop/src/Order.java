public class Order {
    private Cart cart;
    private String status;

    public Order(Cart cart) {
        this.cart = cart;
        this.status = "Pending";
    }

    public void processOrder() {
        this.status = "Processed";
        System.out.println("Order processed: " + cart.getTotalPrice());
    }

    public void trackOrder() {
        System.out.println("Order status: " + status);
    }
}
