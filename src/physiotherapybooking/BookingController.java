/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Arbaaz
 */
public class BookingController {

    private Scanner input = new Scanner(System.in);
    private Patient sysUser;

    private PhysicianList listOfPhysician = new PhysicianList();
    private PatientList listOfPatients = new PatientList();
    private RoomsList listOfRooms = new RoomsList();
    private BookingList bookingList = new BookingList();

    public BookingController() {
        //boolean sysActive = true;
        //System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");
        int option;
        //String usersInput = "";

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");
//        System.out.println("=========================================================================");
//        System.out.println("Enter: ( 0 )to log out\nEnter: ( 1 ) to login\nEnter: ( 2 ) Sign up\nEnter: ( 3 ) Continue as Visitor");

        //option = sc1.nextInt();
        do {
            System.out.println("=========================================================================");
            System.out.println("Enter: ( 0 )to exit\nEnter: ( 1 ) to login\nEnter: ( 2 ) Sign up\nEnter: ( 3 ) Continue as Visitor");

            option = sc1.nextInt();
            switch (option) {
                case 0:
                    exit();
                    break;
                case 1:
                    login();
                    break;
//                    String usersInput = "";
//                    do {
//                        System.out.println("please enter user ID");
//                        usersInput = sc2.nextLine();
//                    } while (usersInput.isEmpty());
//                    if (listOfPatients.patientExists(usersInput)) {
//                        sysUser = listOfPatients.getPatientByID(usersInput);
//                        System.out.println("Welcome " + sysUser.getFullName());
//                        usersInput = null;
//                        int logOption;
//
//                        /////////////////////////////////////////////////////////////////
//                        // search for physician via name; view bookings;
//                        //logOption = sc1.nextInt();
////                        do {
////                            System.out.println("Enter: ( 1 ) Search for Physician by name\nEnter: ( 2 )");
////
////                            logOption = sc1.nextInt();
////                            switch (logOption) {
////                                case 1:
////                                    String enteredName = "";
////                                    do {
////                                        System.out.println("Enter a physicians name: ");
////                                        enteredName = input.nextLine();
////                                    } while (enteredName.isEmpty());
////
////                                    if (listOfPhysician.physicianExists(enteredName)) {
////                                        System.out.println(listOfPhysician.getAPhysicianByName(enteredName));
////                                        do {
////                                            System.out.println("Would you like to select a appointment? (Y/N)");
////                                            usersInput = input.nextLine();
////                                        } while (usersInput.isEmpty());
////
////                                        if (usersInput.equalsIgnoreCase("y")) {
////                                            //select time
////                                            //Physician phys = new Physician(listOfPhysician.getAPhysicianByName(usersInput)); 
////                                            // ask for year month time
////                                            System.out.println();
////                                            usersInput = "";
////
////                                            do {
////                                                System.out.println("selct a date");
////                                                usersInput = input.nextLine();
////                                            } while (usersInput.isEmpty());
////                                            int selectedDate = Integer.parseInt(usersInput);
////
////                                            Physician phys = listOfPhysician.getAPhysicianByName(enteredName);
////                                            LocalDateTime selected = (listOfPhysician.getAPhysicianByName(enteredName).selectTime(selectedDate));
////
////                                            first:
////                                            for (int i = 0; i <= listOfRooms.getSize(); i++) {
////                                                Room room = listOfRooms.getRoom(i);
////                                                Treatment tr = new Treatment("", room, selected, phys, sysUser);
////
////                                                Booking book = new Booking(tr);
////                                                String mesg = bookingList.addBooking(book);
////                                                if (mesg.equalsIgnoreCase("Booking complete")) {
////                                                    System.out.println(mesg);
////                                                    break first;
////                                                } else if (i == listOfRooms.getSize()) {
////                                                    System.out.println(mesg);
////                                                    break first;
////                                                }
////                                            }
////
////                                            //Room room = new Room("");
////                                            //Treatment tr = new Treatment("",room,selected,phys, sysUser);
////                                        }
////                                        /////////////////////////////////////////////////////////////////
////
////                                    } else {
////                                        System.out.println("USER DOES NOT EXIST");
////                                    }
////                                    option = -1;
////                                    break;
////                            }
////                        } while (logOption != 0);
//                    }

                /////////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                    signUp();
                    break;
                    
                case 3:
                    break;

            }
        } while (option != 0);
        //System.out.println("Thank you for using the system");
    }

    private void signUp() {
        int option;
        String userInput;
        String id;
        String fullName;
        String address;
        String telephone;

        System.out.println("Enter userid:");
        id = input.nextLine();

        System.out.println("Enter name:");
        fullName = input.nextLine();

        System.out.println("Enter address:");
        address = input.nextLine();

        System.out.println("Enter telephone:");
        telephone = input.nextLine();

        Patient patient = new Patient(id, fullName, address, telephone);
        listOfPatients.addPatient(patient);
        System.out.println("New User Created: " + listOfPatients.getPatientByName(fullName));
        //return option = -1;
    }

    //System.out.println("Thank you for using the system");
    private void exit() {
        System.out.println("Thank you for using the system");
        System.exit(0);
    }

    private void login() {
        String usersInput = "";
        //int option;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("please enter user ID");
            usersInput = sc2.nextLine();
        } while (usersInput.isEmpty());
        if (listOfPatients.patientExists(usersInput)) {
            sysUser = listOfPatients.getPatientByID(usersInput);
            System.out.println("Welcome " + sysUser.getFullName());
            usersInput = null;
            int logOption;

            /////////////////////////////////////////////////////////////////
            // search for physician via name; view bookings;
            //logOption = sc1.nextInt();
            do {
                System.out.println("Enter: ( 1 ) Search for Physician by name\nEnter: ( 2 )");

                logOption = sc1.nextInt();
                switch (logOption) {
                    case 1:
                        String enteredName = "";
                        do {
                            System.out.println("Enter a physicians name: ");
                            enteredName = input.nextLine();
                        } while (enteredName.isEmpty());

                        if (listOfPhysician.physicianExists(enteredName)) {
                            System.out.println(listOfPhysician.getAPhysicianByName(enteredName));
                            do {
                                System.out.println("Would you like to select a appointment? (Y/N)");
                                usersInput = input.nextLine();
                            } while (usersInput.isEmpty());

                            if (usersInput.equalsIgnoreCase("y")) {
                                //select time
                                //Physician phys = new Physician(listOfPhysician.getAPhysicianByName(usersInput)); 
                                // ask for year month time
                                System.out.println();
                                usersInput = "";

                                do {
                                    System.out.println("selct a date");
                                    usersInput = input.nextLine();
                                } while (usersInput.isEmpty());
                                int selectedDate = Integer.parseInt(usersInput);

                                Physician phys = listOfPhysician.getAPhysicianByName(enteredName);
                                LocalDateTime selected = (listOfPhysician.getAPhysicianByName(enteredName).selectTime(selectedDate));

                                first:
                                for (int i = 0; i <= listOfRooms.getSize(); i++) {
                                    Room room = listOfRooms.getRoom(i);
                                    Treatment tr = new Treatment("", room, selected, phys, sysUser);

                                    Booking book = new Booking(tr);
                                    String mesg = bookingList.addBooking(book);
                                    if (mesg.equalsIgnoreCase("Booking complete")) {
                                        System.out.println(mesg);
                                        break first;
                                    } else if (i == listOfRooms.getSize()) {
                                        System.out.println(mesg);
                                        break first;
                                    }
                                }

                                //Room room = new Room("");
                                //Treatment tr = new Treatment("",room,selected,phys, sysUser);
                            }
                            /////////////////////////////////////////////////////////////////

                        } else {
                            System.out.println("USER DOES NOT EXIST");
                        }
                        
                        
                }
            } while (logOption != 0);
        }
        //return option = -1;
    }
}
