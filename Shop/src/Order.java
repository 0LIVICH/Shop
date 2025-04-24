import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        products.forEach(System.out::println);
    }
}
