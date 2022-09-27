package MiniProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getCustomerId() {
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        assertEquals("101", c.getCustomerId());
        Customer c1 = new Customer("102", "Wiley", "101", 100, 50.0);
        assertEquals("102", c1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        assertEquals("Wiley", c.getCustomerName());
    }

    @Test
    void getCustomerAreaCode() {
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        assertEquals("101", c.getCustomerAreaCode());
    }

    @Test
    void getNumberOfUnitsConsumed() {
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        assertEquals(100, c.getNumberOfUnitsConsumed());
    }

    @Test
    void getTotalBill() {
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        assertEquals((Double) 50.0, c.getTotalBill());
    }
}