// WarehouseSystem.java
public class WarehouseSystem {
    public static void main(String[] args) {
        // Create storage for different categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items
        electronicsStorage.addItem(new Electronics("Laptop", 1200.99));
        electronicsStorage.addItem(new Electronics("Smartphone", 899.49));

        groceriesStorage.addItem(new Groceries("Milk", 3.99));
        groceriesStorage.addItem(new Groceries("Rice", 12.49));

        furnitureStorage.addItem(new Furniture("Chair", 49.99));
        furnitureStorage.addItem(new Furniture("Table", 149.99));

        // Display all items using wildcard method
        System.out.println("\nElectronics Storage:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
