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
    private Scanner sc1 = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);
    private Patient sysUser;

    private PhysicianList listOfPhysician = new PhysicianList();
    private PatientList listOfPatients = new PatientList();
    private RoomsList listOfRooms = new RoomsList();
    private BookingList bookingList = new BookingList();

    public BookingController() {

        int option;

        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");

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

                case 2:
                    signUp();
                    break;

                case 3:
                    break;

            }
        } while (option != 0);
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

    private void exit() {
        System.out.println("Thank you for using the system");
        System.exit(0);
    }

    private void login() {
        String usersInput = "";

        do {
            System.out.println("please enter user ID");
            usersInput = sc2.nextLine();
        } while (usersInput.isEmpty());
        if (listOfPatients.patientExists(usersInput)) {
            sysUser = listOfPatients.getPatientByID(usersInput);
            System.out.println("Welcome " + sysUser.getFullName());
            usersInput = null;
            int logOption;

            do {
                System.out.println("Enter: ( 0 ) Log out\nEnter: ( 1 ) Search for Physician by name\nEnter: ( 2 )");

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
                                System.out.println("Would you like to make a treatment appointment? (Y/N)");
                                usersInput = input.nextLine();
                            } while (usersInput.isEmpty());

                            if (usersInput.equalsIgnoreCase("y")) {
                                //usersInput = "";
                                Physician phys = listOfPhysician.getAPhysicianByName(enteredName);
                                System.out.println();

                                do {
                                    System.out.println("Enter a treatment");
                                    System.out.println(phys.getAllExpertise());
                                    usersInput = input.nextLine();
                                } while (usersInput.isEmpty());
                                String treatment = phys.getExpertise(usersInput);

                                usersInput = "";

                                do {
                                    System.out.println("selct a date");
                                    System.out.println(phys.getAppointmentHours());
                                    usersInput = input.nextLine();
                                } while (usersInput.isEmpty());
                                int selectedDate = Integer.parseInt(usersInput);

                                LocalDateTime selected = (phys.selectTime(selectedDate));

                                first:
                                for (int i = 0; i <= listOfRooms.getSize(); i++) {
                                    Room room = listOfRooms.getRoom(i);
                                    Treatment tr = new Treatment(treatment, room, selected, phys, sysUser);

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

                            }

                        }

                    case 2:
                        // view my bookings -> change/cancel bookings

                        break;
                }
            } while (logOption != 0);
        } else {
            System.out.println("USER DOES NOT EXIST");
        }
        //return option = -1;
        sysUser = null;
    }
}
