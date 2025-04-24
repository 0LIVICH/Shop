import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

    public List<Product> filterByPrice(List<Product> products, double minPrice, double maxPrice) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> filterByManufacturer(List<Product> products, String manufacturer) {
        return products.stream()
                .filter(product -> product.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Product> filterByKeyword(List<Product> products, String keyword) {
        return products.stream()
                .filter(product -> product.getName().contains(keyword))
                .collect(Collectors.toList());
    }
}
