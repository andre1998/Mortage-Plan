/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

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
 * @author AndrÃ©
 */
public class CustomerTest {
    
    private Customer t1;
    private Customer t2;
    private Customer t3;
    private Customer t4;
    
    public CustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        t1 = new Customer("John,,,,, Test,,, Case", 1000.50, 4.5, 8);
        t2 = new Customer("Johan  2354Test 012345Test", 4000, 5.7, 10);
        t3 = new Customer("22222        ,, ,,, ,,               Erik", 10000, 3, 20);
        t4 = new Customer("Long   ,, Long Test     ,, ,,, ,,               Erik", 10000, 3, 20);
    }   
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        assertEquals("John Test Case", t1.getName());
        assertEquals("Johan Test Test", t2.getName());
        System.out.println(t3.getName());
        assertEquals("Erik", t3.getName());
        assertEquals("Long Long Test Erik", t4.getName());
        /**String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        * */
    }

    /**
     * Test of getLoan method, of class Customer.
     */
    @Test
    public void testGetLoan() {
        System.out.println("getLoan");
        assertEquals(1000.50, t1.getLoan());
        assertEquals(4000, t2.getLoan());
        assertEquals(10000, t3.getLoan());
        /*Customer instance = null;
        double expResult = 0.0;
        double result = instance.getLoan();
        assertEquals(expResult, result, 0.0);*/
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInterest method, of class Customer.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        assertEquals(4.5, t1.getInterest());
        assertEquals(5.7, t2.getInterest());
        assertEquals(3, t3.getInterest());
    }

    /**
     * Test of getYear method, of class Customer.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        assertEquals(8, t1.getYear());
        assertEquals(10, t2.getYear());
        assertEquals(20, t3.getYear());
    }

    /**
     * Test of getMonthlyPayment method, of class Customer.
     */
    /*@Test
    public void testGetMonthlyPayment() {
        System.out.println("getMonthlyPayment");
        Customer instance = null;
        double expResult = 0.0;
        double result = instance.getMonthlyPayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMonthlyPayment method, of class Customer.
     */
    /*@Test
    public void testSetMonthlyPayment() {
        System.out.println("setMonthlyPayment");
        Customer instance = null;
        instance.setMonthlyPayment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
