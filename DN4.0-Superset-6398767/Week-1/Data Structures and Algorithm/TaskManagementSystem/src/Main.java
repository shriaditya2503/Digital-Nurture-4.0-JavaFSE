import com.aditya.Task;
import com.aditya.TaskLinkedList;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Write backend", "In Progress"));
        taskList.addTask(new Task(3, "Test application", "Pending"));

        // Display tasks
        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        // Search task
        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Not found");

        // Delete task
        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTask(1);

        // Display after deletion
        System.out.println("\nUpdated Tasks:");
        taskList.displayTasks();
    }
}