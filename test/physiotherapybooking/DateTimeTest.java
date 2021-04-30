/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arbaaz
 */
public class DateTimeTest {
    
    public DateTimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class DateTime.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        
        String expResult = "02/04/2021";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class DateTime.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "01/01/1999";
        
        String expResult = "01/01/1999";
        
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        instance.setDate(date);
        String result = instance.getDate();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class DateTime.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        String expResult = "5:00 - 6:00";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTime method, of class DateTime.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "21:00 = 13:00";
        String expResult ="21:00 = 13:00";
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        instance.setTime(time);
        String result = instance.getTime();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult,result);
    }

    /**
     * Test of toString method, of class DateTime.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        String expResult = "Date: " + instance.getDate() + " || " + "Time: " + instance.getTime();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isAvailable method, of class DateTime.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        boolean expResult = true;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAvailable method, of class DateTime.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean expResult = false;
        boolean available = false;
        DateTime instance = new DateTime("02/04/2021","5:00 - 6:00");
        instance.setAvailable(available);
        boolean result = instance.isAvailable();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }
    
}
