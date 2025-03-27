// Product.java
public abstract class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public abstract String getCategory(); // Abstract method to enforce category

    @Override
    public String toString() {
        return getCategory() + " - " + name + " (₹" + price + ")";
    }
}
