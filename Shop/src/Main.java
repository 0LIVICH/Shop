import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, "Dell", 5);
        Product p2 = new Product("Phone", 700, "Apple", 4);
        Product p3 = new Product("Headphones", 150, "Sony", 3);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        ProductFilter filter = new ProductFilter();
        System.out.println("Filtered by price:");
        filter.filterByPrice(List.of(p1, p2, p3), 100, 1000).forEach(System.out::println);

        RecommendationSystem recommendation = new RecommendationSystem();
        System.out.println("Recommendations:");
        recommendation.recommendBasedOnRating(List.of(p1, p2, p3), 4).forEach(System.out::println);

        Order order = new Order(cart);
        order.processOrder();
        order.trackOrder();
    }
}
