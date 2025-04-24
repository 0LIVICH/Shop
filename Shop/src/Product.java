public class Product {
    private String id;
    private String name;
    private double price;
    private String manufacturer;
    private int rating;

    public Product(String id, String name, double price, String manufacturer, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + ", manufacturer='" + manufacturer + "', rating=" + rating + "}";
    }
}
