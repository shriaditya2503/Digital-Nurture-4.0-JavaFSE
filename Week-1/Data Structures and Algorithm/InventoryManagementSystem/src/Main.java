import com.aditya.InventoryManager;
import com.aditya.Product;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 50, 75000);
        Product p2 = new Product(102, "Mouse", 200, 500);
        Product p3 = new Product(103, "Keyboard", 150, 800);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println();
        manager.viewAllProducts();

        System.out.println();
        manager.updateProduct(102, 180, 450);

        System.out.println();
        manager.deleteProduct(101);

        System.out.println();
        manager.viewAllProducts();
    }
}