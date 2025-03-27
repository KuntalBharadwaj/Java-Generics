abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory(); // Abstract method to enforce category

    @Override
    public String toString() {
        return getCategory() + " - " + name + " ($" + price + ")";
    }
}
