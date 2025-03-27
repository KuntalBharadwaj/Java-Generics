// DiscountUtils.java
public class DiscountUtils {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied to " + product.getName() + ": New Price = ₹" + product.getPrice());
    }
}
