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
          BookingController sys = new BookingController();
        
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

    }
}
