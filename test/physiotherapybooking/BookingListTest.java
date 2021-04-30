/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.HashMap;
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
public class BookingListTest {
    
    public BookingListTest() {
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
     * Test of addBooking method, of class BookingList.
     */
    @Test
    public void testAddBooking() {
        System.out.println("addBooking");
        Room room = new Room("a room");
        DateTime dt = new DateTime("Date", "time");
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        Treatment tr = new Treatment ("treatment 1", room, dt, phys1, pat1);
        
        Booking booking = new Booking(tr);
        BookingList instance = new BookingList();
        String expResult = "Booking complete";
        String result = instance.addBooking(booking);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateBookingAttend method, of class BookingList.
     */
//    @Test
//    public void testUpdateBookingAttend() {
//        System.out.println("updateBookingAttend");
//        Room room = new Room("a room");
//        DateTime dt = new DateTime("Date", "time");
//        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
//        Treatment tr = new Treatment ("treatment 1", room, dt, phys1, pat1);
//        
//        Booking booking = new Booking(tr);
//        BookingList instance = new BookingList();
//        Booking.Status expResult = Booking.Status.ATTENDED;
//        instance.updateBookingAttend(booking);
//        Booking.Status result = instance.getPatientBookings(booking.getStatus());
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of updateBookingCancel method, of class BookingList.
     */
    @Test
    public void testUpdateBookingCancel() {
        System.out.println("updateBookingCancel");
        Booking book = null;
        BookingList instance = new BookingList();
        String expResult = "";
        String result = instance.updateBookingCancel(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBookingChanged method, of class BookingList.
     */
    @Test
    public void testUpdateBookingChanged() {
        System.out.println("updateBookingChanged");
        Booking book = null;
        Treatment treatment = null;
        BookingList instance = new BookingList();
        String expResult = "";
        String result = instance.updateBookingChanged(book, treatment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientBookings method, of class BookingList.
     */
    @Test
    public void testGetPatientBookings() {
        System.out.println("getPatientBookings");
        String userid = "";
        BookingList instance = new BookingList();
        HashMap expResult = null;
        HashMap result = instance.getPatientBookings(userid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport1 method, of class BookingList.
     */
    @Test
    public void testPrintReport1() {
        System.out.println("printReport1");
        BookingList instance = new BookingList();
        String expResult = "";
        String result = instance.printReport1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport2 method, of class BookingList.
     */
    @Test
    public void testPrintReport2() {
        System.out.println("printReport2");
        PatientList pl = null;
        BookingList instance = new BookingList();
        String expResult = "";
        String result = instance.printReport2(pl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initBookingsData method, of class BookingList.
     */
    @Test
    public void testInitBookingsData() {
        System.out.println("initBookingsData");
        Timetable time = null;
        PhysicianList phyList = null;
        RoomsList rooms = null;
        PatientList pat = null;
        BookingList instance = new BookingList();
        instance.initBookingsData(time, phyList, rooms, pat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
