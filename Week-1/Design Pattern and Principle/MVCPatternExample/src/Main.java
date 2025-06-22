import com.aditya.Student;
import com.aditya.StudentController;
import com.aditya.StudentView;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aditya", "1015", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        System.out.println();
        controller.updateView();

        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        System.out.println();
        controller.updateView();
    }
}