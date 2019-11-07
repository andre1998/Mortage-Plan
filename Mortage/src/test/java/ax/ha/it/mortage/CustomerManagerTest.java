/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author André
 */
public class CustomerManagerTest {
    
    private List<Customer>list;
    private Customer t1;
    private Customer t2;
    private Customer t3;
    private Customer t4;
    
    public CustomerManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        t1 = new Customer("John", 1000.50, 4.5, 8);
        t2 = new Customer("Johan", 4000, 5.7, 10);
        t3 = new Customer("Erik", 10000, 3, 20);
        t4 = new Customer("Leonard", 3000, 7, 4);
        
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of iterate method, of class CustomerManager.
     */
    @Test
    public void testIterate() {
        System.out.println("iterate");
        CustomerManager instance = new CustomerManager();
        instance.iterate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of append method, of class CustomerManager.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        Customer customer = null;
        CustomerManager instance = new CustomerManager();
        instance.append(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CustomerManager.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        CustomerManager instance = new CustomerManager();
        instance.remove(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFromFile method, of class CustomerManager.
     */
    @Test
    public void testGetDataFromFile() {
        System.out.println("getDataFromFile");
        File file = null;
        CustomerManager instance = new CustomerManager();
        instance.getDataFromFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
