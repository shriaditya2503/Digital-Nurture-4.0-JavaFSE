import com.aditya.Employee;
import com.aditya.EmployeeManager;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add employees
        manager.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        manager.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(103, "Charlie", "HR", 50000));

        // List all
        System.out.println("All Employees:");
        manager.listEmployees();

        // Search
        System.out.println("\nSearching for employee ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        // Delete
        System.out.println("\nDeleting employee ID 101:");
        manager.deleteEmployee(101);

        // List after delete
        System.out.println("\nUpdated Employees:");
        manager.listEmployees();
    }
}