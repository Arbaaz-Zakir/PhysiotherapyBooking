/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Arbaaz
 */
public class Tester1 {

    public static void main(String[] args) {
//        LocalDateTime booking = LocalDateTime.of(2020, Month.MARCH, 01, 13, 0);
//        System.out.println(booking);
//        
//        LocalDateTime arrive = LocalDateTime.of(2020, Month.MARCH, 01, 13, 29);
//        if(arrive.isAfter(booking) && arrive.isBefore(booking.plusMinutes(30))) {
//            System.out.println("arrived");
//        }

//        Physician phys1 = new Physician("111", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
//        Physician phys2 = new Physician("222", "bobo marko", "02 downing street", "0456530");
//        PhysicianList listOfPhysician = new PhysicianList();
//        System.out.println(listOfPhysician.getPhysicianList());
//        listOfPhysician.addPhysicianToList(phys1);
//        listOfPhysician.addPhysicianToList(phys2);
//        System.out.println(listOfPhysician.getPhysicianList());
          //BookingController sys = new BookingController();
        
//        PhysicianList listOfPhysician = new PhysicianList();
//        PatientList listOfPatients = new PatientList();
//        Patient p1 = new Patient("111", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
//        Physician xx = new Physician("222", "bob", "26 dorset park", "5476468");
//        listOfPatients.addPatient(p1);
//        Patient sysUser;
//        
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");
//        System.out.println("=========================================================================");
//        System.out.println("Enter: ( 1 ) to login\nEnter: ( 2 ) Sign up\nEnter: ( 3 ) Continue as Visitor");
//
//        int choice = sc1.nextInt();
//        String usersInput = "";
//        switch (choice) {
//            case 1:
//                do {
//                    System.out.println("please enter user ID");
//                    usersInput = sc2.nextLine();
//                } while (usersInput.isEmpty());
//                if(listOfPatients.patientExists(usersInput)){
//                    sysUser = listOfPatients.getPatientByID(usersInput);
//                    System.out.println("Welcome " + sysUser.getFullName());
//                }
//                else{
//                    System.out.println("USER DOES NOT EXIST");
//                }
//                break;
//
//            case 2:
//                break;
//            case 3:
//                break;
//        }
          Room room = new Room("medical suite 1");
          Room room2 = new Room("medical suite 2");
          Physician p1 = new Physician("111","mark", "address1", "012" );
          p1.addExpertise("accupunture");
          p1.addAppointmentHours(LocalDateTime.of(2020, Month.MARCH, 01, 13, 29));
          Patient a1 = new Patient("211","bob", "address2", "02312" );
          Patient a2 = new Patient("212","nina", "address3", "3312" );
          Patient a3 = new Patient("213","andy", "address4", "4312" );
          Patient a4 = new Patient("214","joe", "address25", "64312" );
          LocalDateTime pt = p1.selectTime(1);
          Treatment t1 = new Treatment("accupunture", room, pt, p1, a1);
          Treatment t2 = new Treatment("accupunture", room, pt, p1, a2);
          Treatment t3 = new Treatment("accupunture", room2, pt, p1, a3);
          Booking book = new Booking(t1);
          Booking book2 = new Booking(t2);
          Booking book3 = new Booking(t3);
          
          Report bookings = new  Report();
          bookings.addReport1(book);
          bookings.addReport1(book2);
          bookings.addReport1(book3);
          
          //System.out.println(book2.toString());
          //System.out.println(bookings.printReport1());
          System.out.println(bookings.printReport2());
    }
}
