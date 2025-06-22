import com.aditya.Product;
import com.aditya.SearchUtils;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Book", "Stationery"),
                new Product(102, "Shampoo", "Beauty"),
                new Product(105, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics")
        };

        String searchItem = "Keyboard";

        System.out.println("Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, searchItem);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println();
        System.out.println("Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, searchItem);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}