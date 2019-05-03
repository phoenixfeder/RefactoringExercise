import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("peter");
        assert(customer.getName().equals("peter"));
    }
}