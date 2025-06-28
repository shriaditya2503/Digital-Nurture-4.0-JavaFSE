import com.aditya.Book;
import com.aditya.SearchUtils;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen Weiss"),
                new Book(103, "Algorithms", "Robert Sedgewick"),
                new Book(104, "Clean Code", "Robert C. Martin"),
                new Book(105, "Design Patterns", "Erich Gamma")
        };

        String searchTitle = "Clean Code";

        System.out.println("Linear Search:");
        Book result1 = SearchUtils.linearSearch(books, searchTitle);
        System.out.println(result1 != null ? result1 : "Book not found");

        System.out.println("\nBinary Search:");
        Book result2 = SearchUtils.binarySearch(books, searchTitle);
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}