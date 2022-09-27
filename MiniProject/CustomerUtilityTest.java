package MiniProject;

import jdk.internal.util.xml.impl.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CustomerUtilityTest {

    @Test
    void addCustomer() {
        CustomerUtility cu = new CustomerUtility();
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        cu.addCustomer(c);
        Assertions.assertTrue(cu.displayCustomers());

        /*
            String input = "add 5";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
         */
//
//        c1.addCustomer();
//        Assertions.assertTrue(c1.displayCustomers());
    }

    @Test
    void displayCustomers() {

    }

    @Test
    void displayDescendingOrder() {
    }

    @Test
    void displayCustomerWithAreaCode() {
        CustomerUtility cu = new CustomerUtility();
        Assertions.assertFalse(cu.displayCustomerWithAreaCode());

        CustomerUtility cu1 = new CustomerUtility();
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        cu1.addCustomer(c);

        
        String in = "101";
        InputStream in1 = new ByteArrayInputStream(in.getBytes());
        System.setIn(in1);
        Assertions.assertTrue(cu1.displayCustomerWithAreaCode());
    }

    @Test
    void createMapOnAreaCode() {
        CustomerUtility cu = new CustomerUtility();
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        cu.addCustomer(c);
        Map<String, List<Customer>> map = cu.createMapOnAreaCode();
        Map<String, List<Customer>> mp = new HashMap<>();
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c);
        mp.put("101",customerList);
        Assertions.assertEquals(map, mp);
        CustomerUtility cu1 = new CustomerUtility();
        Map<String, List<Customer>> mp1 = new HashMap<>();
        Assertions.assertEquals(mp1, cu1.createMapOnAreaCode());
    }

    @Test
    void serDes() throws IOException, ClassNotFoundException {
        CustomerUtility cu = new CustomerUtility();
        Customer c = new Customer("101", "Wiley", "101", 100, 50.0);
        cu.addCustomer(c);
        cu.serialize();
        cu = null;
        cu = CustomerUtility.deserialize();
        Assertions.assertTrue(cu.displayCustomers());
    }
}
