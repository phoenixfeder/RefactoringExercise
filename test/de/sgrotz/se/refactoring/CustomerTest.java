package de.sgrotz.se.refactoring;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    public void getName() {
        Customer customer = new Customer("peter");
        assert (customer.getName().equals("peter"));

    }
}