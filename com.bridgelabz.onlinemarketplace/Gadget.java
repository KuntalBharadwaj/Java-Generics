// Gadget.java
public class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Gadget";
    }
}
