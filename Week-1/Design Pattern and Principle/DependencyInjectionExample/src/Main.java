import com.aditya.CustomerRepository;
import com.aditya.CustomerRepositoryImpl;
import com.aditya.CustomerService;

public class Main {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.showCustomerDetails(1);
        service.showCustomerDetails(2);
        service.showCustomerDetails(99);
    }
}