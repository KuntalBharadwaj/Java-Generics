// Marketplace.java
import java.util.ArrayList;
import java.util.List;

public class Marketplace {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> catalog = new ArrayList<>();

        // Add different types of products
        catalog.add(new Book("The Java Handbook", 25.99));
        catalog.add(new Clothing("T-Shirt", 15.49));
        catalog.add(new Gadget("Wireless Earbuds", 99.99));

        // Display initial product catalog
        System.out.println("Product Catalog:");
        for (Product product : catalog) {
            System.out.println(product);
        }

        // Apply discount dynamically
        System.out.println("\nApplying Discounts:");
        for (Product product : catalog) {
            DiscountUtils.applyDiscount(product, 10.0);
        }

        // Display final product catalog after discount
        System.out.println("\nUpdated Product Catalog:");
        for (Product product : catalog) {
            System.out.println(product);
        }
    }
}



// Book - The Java Handbook (?23.391)
// Clothing - T-Shirt (?13.941)
// Gadget - Wireless Earbuds (?89.991)
// PS D:\bridgelabz-workspace\Java-Generics>

// Book - The Java Handbook (?23.391)
// Clothing - T-Shirt (?13.941)
// Gadget - Wireless Earbuds (?89.991)
// Book - The Java Handbook (?23.391)
// Clothing - T-Shirt (?13.941)
// Book - The Java Handbook (?23.391)
// Clothing - T-Shirt (?13.941)
// Gadget - Wireless Earbuds (?89.991)
