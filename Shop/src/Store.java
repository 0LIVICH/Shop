import java.util.List;

public class Store {
    private List<Product> products;
    private ProductFilter productFilter;

    public Store(List<Product> products, ProductFilter productFilter) {
        this.products = products;
        this.productFilter = productFilter;
    }

    public void displayAvailableProducts() {
        List<Product> filteredProducts = productFilter.filter(products);
        filteredProducts.forEach(System.out::println);
    }
}
