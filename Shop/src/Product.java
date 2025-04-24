public class Product {
    private String name;
    private double price;
    private String manufacturer;
    private int rating;

    public Product(String name, double price, String manufacturer, int rating) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
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
        return name + " (" + manufacturer + ") - $" + price + " | Rating: " + rating;
    }
}
