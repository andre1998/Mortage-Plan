/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

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
    
    private CustomerManager test;
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
        test = new CustomerManager();
        t1 = new Customer("John,,,,, Test,,, Case", 1000.50, 4.5, 8);
        t2 = new Customer("Johan  2354Test 012345Test", 4000, 5.7, 10);
        t3 = new Customer("22222        ,, ,,, ,,               Erik", 10000, 3, 20);
        t4 = new Customer("Long   ,, Long Test     ,, ,,, ,,               Erik", 10000, 3, 20);
        test.append(t1);
    }   
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of iterate method, of class CustomerManager.
     */
    /*@Test
    public void testIterate() {
    }*/

    /**
     * Test of get method, of class CustomerManager.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        assertEquals(t1, test.get(0));
    }

    /**
     * Test of append method, of class CustomerManager.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        test.append(t2);
        assertEquals(t2, test.get(1));
        
    }

    /**
     * Test of getDataFromFile method, of class CustomerManager.
     */
    @Test
    public void testGetDataFromFile() {
    }
    
}
