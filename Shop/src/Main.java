import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("1", "Laptop", 800, "Dell", 4),
                new Product("2", "Smartphone", 500, "Apple", 5),
                new Product("3", "Tablet", 300, "Samsung", 3)
        );

        ProductFilter priceFilter = new PriceFilter(400, 700);

        Store store = new Store(products, priceFilter);
        store.displayAvailableProducts();

        Order order = new Order("12345");
        order.addProduct(products.get(0));
        order.addProduct(products.get(1));

        order.displayOrder();
    }
}
