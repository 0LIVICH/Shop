import java.util.List;
import java.util.stream.Collectors;

public class RecommendationSystem {

    public List<Product> recommendBasedOnRating(List<Product> products, int ratingThreshold) {
        return products.stream()
                .filter(product -> product.getRating() >= ratingThreshold)
                .collect(Collectors.toList());
    }
}
