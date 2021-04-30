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
public class TreatmentTest {
    
    public TreatmentTest() {
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
     * Test of getTreatmentName method, of class Treatment.
     */
    @Test
    public void testGetTreatmentName() {
        System.out.println("getTreatmentName");
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        Room room = new Room("room");
        
        Treatment instance = new Treatment ("treatment name", room, dt ,phys1, pat1);
        
        String expResult = "treatment name";
        String result = instance.getTreatmentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTreatmentName method, of class Treatment.
     */
    @Test
    public void testSetTreatmentName() {
        System.out.println("setTreatmentName");
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        Room room = new Room("room");
        
        String expResult = "newtreatment";
        String treatmentName = "newtreatment";
        Treatment instance = new Treatment ("treatment name", room, dt ,phys1, pat1);
        instance.setTreatmentName(treatmentName);
        String result = instance.getTreatmentName();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoom method, of class Treatment.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        Room room = new Room("room");

        
        Treatment instance = new Treatment ("treatment name", room, dt ,phys1, pat1);
        
        Room expResult = room;
        Room result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setRoom method, of class Treatment.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        Room room0 = new Room("Room");
        
        Room room = new Room("new Room");
        
        Room expResult = new Room("new Room");
        
        Treatment instance = new Treatment ("treatment name", room0, dt ,phys1, pat1);
        instance.setRoom(room);
        Room result = instance.getRoom();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }

    /**
     * Test of getAppointmentTime method, of class Treatment.
     */
    @Test
    public void testGetAppointmentTime() {
        System.out.println("getAppointmentTime");
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        //phys1.addAppointmentHours(dt);
        
        Room room = new Room("Room");
        
        Treatment instance = new Treatment ("treatment name", room, dt ,phys1, pat1);
        
        DateTime expResult = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        DateTime result = instance.getAppointmentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAppointmentTime method, of class Treatment.
     */
    @Test
    public void testSetAppointmentTime() {
        System.out.println("setAppointmentTime");
        DateTime appointmentTime = new DateTime("02/04/2021" ,Timetable.FIVEOCLOCK);
        
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime("02/04/2021" ,Timetable.ONEOCLOCK);
        //phys1.addAppointmentHours(dt);
        
        Room room = new Room("Room");
        
        Treatment instance = new Treatment ("treatment name", room, dt ,phys1, pat1);
        
        
        DateTime expResult= new DateTime("02/04/2021" ,Timetable.FIVEOCLOCK);
        instance.setAppointmentTime(appointmentTime);
        DateTime result= instance.getAppointmentTime();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhysician method, of class Treatment.
     */
    @Test
    public void testGetPhysician() {
        System.out.println("getPhysician");
        Treatment instance = null;
        Physician expResult = null;
        Physician result = instance.getPhysician();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhysician method, of class Treatment.
     */
    @Test
    public void testSetPhysician() {
        System.out.println("setPhysician");
        Physician physician = null;
        Treatment instance = null;
        instance.setPhysician(physician);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Treatment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Treatment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Treatment.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Treatment instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
