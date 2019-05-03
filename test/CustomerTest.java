import de.sgrotz.se.refactoring.Customer;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("peter");
        assert(customer.getName().equals("peter"));
    }
}