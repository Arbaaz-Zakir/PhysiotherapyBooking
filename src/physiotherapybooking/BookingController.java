/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
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
    private final Timetable timetable = new Timetable();

    public BookingController() {
        //timetable.initTimetable();
        
        listOfPhysician.physicianListLoad(timetable);
        bookingList.initBookingsData(timetable, listOfPhysician, listOfRooms, listOfPatients);
        int option;

        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");

        //option = sc1.nextInt();
        do {
            System.out.println("=========================================================================");
            System.out.println("Enter: ( 0 )to exit\nEnter: ( 1 ) to login\nEnter: ( 2 ) Sign up\nEnter: ( 3 ) Continue as Visitor\nEnter: ( 4 ) to generate report 1\nEnter: ( 5 ) to generate report 2");

            option = sc1.nextInt();
            switch (option) {
                case 0:
                    exit();
                    break;
                case 1:
                    login();
                    option = -1;
                    break;

                case 2:
                    signUp();
                    option = -1;
                    break;

                case 3:
                    visitor();
                    option = -1;
                    break;

                case 4:
                    System.out.println(bookingList.printReport1());
                    option = -1;
                    break;
                case 5:
                    System.out.println(bookingList.printReport2(listOfPatients));
                    option = -1;
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
                System.out.println("Enter: ( 0 ) Log out\nEnter: ( 1 ) Search for Physician by name\nEnter: ( 2 ) View your Bookings\nEnter: ( 3 ) Search for Physician by expertise");

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
/////////////////////////////////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                DateTime selected = (phys.getDateTimeAppointment(selectedDate));
                                ArrayList<Room> ro = new ArrayList();
                                ro = listOfRooms.getRoomList();
                                String result;
                                for (Room room : ro) {
                                    Treatment tr = new Treatment(treatment, room, selected, phys, sysUser);
                                    Booking book = new Booking(tr);
                                    result = bookingList.addBooking(book);
                                    if (result.equalsIgnoreCase("Booking complete")) {
                                        System.out.println(result);
                                        break;
                                    } else if (result.equalsIgnoreCase("You already have a booking at this time")) {
                                        System.out.println(result);
                                        break;
                                    } else {
                                        System.out.println(room.getRoom() + " : " + result + " BOOKING FAILED");
                                    }
                                }

                            }

                        }
                        break;

                    case 2:
                        int statusOption = -1;
                        //logOption = -1;
                        //System.out.println("Enter: ( 0 ) Go Back\nEnter: ( 1 ) Attend a Booking\nEnter: ( 2 ) Cancel a Booking");
                        // view my bookings -> change/cancel bookings
                        do {
                            //System.out.println("Enter: ( 0 ) Go Back\nEnter: ( 1 ) Attend a Booking\nEnter: ( 2 ) Cancel a Booking");
                            HashMap<Integer, Booking> myBookings = bookingList.getPatientBookings(sysUser.getUserID());
                            String books = "\n=============================\n"
                                    + "YOUR BOOKINGS"
                                    + "\n=============================\n";
                            for (int i = 1; i <= myBookings.size(); i++) {
                                books += "\nBooking %s:\n" + myBookings.get(i).toString() + "\n";
                                books = String.format(books, i);
                            }
                            System.out.println(books);
                            System.out.println("Enter: ( 0 ) Go Back\nEnter: ( 1 ) Attend a Booking\nEnter: ( 2 ) Cancel a Booking\nEnter: ( 3 ) change a Booking");

                            statusOption = input.nextInt();

                            if (statusOption == 1) {
                                String s = "";
                                if (myBookings.size() == 0) {
                                    System.out.println("No Bookings found");
                                } else {
                                    if (myBookings.size() >= 2) {

                                        s += myBookings.size() + 1;
                                    }
                                    System.out.println("Enter a booking to attend 1 - " + s);
                                    int selectedBooking;
                                    selectedBooking = input.nextInt();
                                    System.out.println(bookingList.updateBookingAttend(myBookings.get(selectedBooking)));
                                }
                                statusOption = -1;
                            } else if (statusOption == 2) {
                                String s = "";
                                if (myBookings.size() == 0) {
                                    System.out.println("No Bookings Found");
                                } else {
                                    if (myBookings.size() >= 2) {

                                        s += myBookings.size() + 1;
                                    }
                                    System.out.println("Enter a booking to cancel 1 - " + s);
                                    int selectedBooking;
                                    selectedBooking = input.nextInt();
                                    System.out.println(bookingList.updateBookingCancel(myBookings.get(selectedBooking)));

                                }

                                statusOption = -1;
                            } else if (statusOption == 3) {
                                String s = "";
                                if (myBookings.size() == 0) {
                                    System.out.println("No Bookings Found");
                                } else {
                                    if (myBookings.size() >= 2) {

                                        s += myBookings.size() + 1;
                                    }
                                    System.out.println("Enter a booking to change 1 - " + s);
                                    int selectedBooking;
                                    selectedBooking = input.nextInt();
                                    //System.out.println("Enter: ( 0 ) Go Back\nEnter: ( 1 ) Attend a Booking\nEnter: ( 2 ) ");
                                    usersInput = "";
                                    System.out.println("selcet new appointment time");
                                    do {
                                        System.out.println("selct a new date");
                                        System.out.println(myBookings.get(selectedBooking).getTreatment().getPhysician().getAppointmentHours());
                                        usersInput = input.nextLine();
                                    } while (usersInput.isEmpty());
                                    int newSelectedDate = Integer.parseInt(usersInput);

                                    DateTime newDateTime = myBookings.get(selectedBooking).getTreatment().getPhysician().getDateTimeAppointment(newSelectedDate);
                                    Treatment treatment = myBookings.get(selectedBooking).getTreatment();
                                    treatment.setAppointmentTime(newDateTime);
                                    System.out.println(bookingList.updateBookingChanged(myBookings.get(selectedBooking), treatment));

                                }
                            }
                            //logOption = -1;

                        } while (statusOption != 0);
                        break;
                    case 3:
                        String desiredExpertise = "";
                        do {
                            System.out.println("Search expertise you seek: ");
                            desiredExpertise = input.nextLine();
                        } while (desiredExpertise.isEmpty());
                        ArrayList<Physician> searchResult = listOfPhysician.getPhysiciansByExpertise(desiredExpertise);
                        if (!searchResult.isEmpty()) {
                            for (Physician potentialPhysician : searchResult) {
                                System.out.println(potentialPhysician.getFullName() + "\n==============\n" + potentialPhysician.getAppointmentHours());
                            }
                            String choiseByExp;
                            do {
                                System.out.println("Would you like to make a treatment appointment? (Y/N)");
                                choiseByExp = input.nextLine();
                            } while (choiseByExp.isEmpty());
                            if (choiseByExp.equalsIgnoreCase("y")) {
                                do {
                                    System.out.println("Enter a physicians name: ");
                                    enteredName = input.nextLine();
                                } while (enteredName.isEmpty());
                                if (listOfPhysician.physicianExists(enteredName)) {
                                    Physician phys = listOfPhysician.getAPhysicianByName(enteredName);
                                    String selectDateforExpertise;
                                    do {
                                        System.out.println("selct a date");
                                        System.out.println(phys.getAppointmentHours());
                                        selectDateforExpertise = input.nextLine();
                                    } while (selectDateforExpertise.isEmpty());
                                    int selectedDate = Integer.parseInt(selectDateforExpertise);

                                    DateTime selected = (phys.getDateTimeAppointment(selectedDate));
                                    ArrayList<Room> ro = new ArrayList();
                                    ro = listOfRooms.getRoomList();
                                    String result;
                                    for (Room room : ro) {
                                        Treatment tr = new Treatment(desiredExpertise, room, selected, phys, sysUser);
                                        Booking book = new Booking(tr);
                                        result = bookingList.addBooking(book);
                                        if (result.equalsIgnoreCase("Booking complete")) {
                                            System.out.println(result);
                                            break;
                                        } else if (result.equalsIgnoreCase("You already have a booking at this time")) {
                                            System.out.println(result);
                                            break;
                                        } else {
                                            System.out.println(room.getRoom() + " : " + result + " BOOKING FAILED");
                                        }
                                    }
                                }
                            }

                        } else {
                            System.out.println("No physician found with desired expertise");
                        }

                        break;
                }
            } while (logOption != 0);
        } else {
            System.out.println("USER DOES NOT EXIST");
        }
        //return option = -1;
        sysUser = null;
    }

    private void visitor() {
        int logOption;
        do {
            String enteredName;
            String usersInput;
            System.out.println("Enter: ( 0 ) Quit Visitor View\nEnter: ( 1 ) Search for Physician by name\nEnter: ( 2 )");

            logOption = sc1.nextInt();

            if (logOption == 1) {
                do {
                    System.out.println("Enter a physicians name: ");
                    enteredName = input.nextLine();
                } while (enteredName.isEmpty());

                if (listOfPhysician.physicianExists(enteredName)) {
                    System.out.println(listOfPhysician.getAPhysicianByName(enteredName));
                    do {
                        System.out.println("Would you like to make a visitors appointment? (Y/N)");
                        usersInput = input.nextLine();
                    } while (usersInput.isEmpty());

                    if (usersInput.equalsIgnoreCase("y")) {
                        //usersInput = "";
                        Physician phys = listOfPhysician.getAPhysicianByName(enteredName);

                        usersInput = "";

                        do {
                            System.out.println("selct a date");
                            System.out.println(phys.getConsultation());
                            usersInput = input.nextLine();
                        } while (usersInput.isEmpty());
                        int selectedDate = Integer.parseInt(usersInput);
                        DateTime selected = (phys.getDateTimeConsultation(selectedDate));
                        String visitorName;
                        do {
                            System.out.println("Before booking an appointment please provide your name");
                            visitorName = input.nextLine();
                        } while (visitorName.isEmpty());

                        String visitorTele;
                        do {
                            System.out.println("Provide contact number for potential follow up consultations");
                            visitorTele = input.nextLine();
                        } while (visitorName.isEmpty());

                        Patient visitor = new Patient("ID: visitor", visitorName, "visitor N/A", "visitor tele: " + visitorTele);

                        ArrayList<Room> ro = new ArrayList();
                        ro = listOfRooms.getRoomList();
                        String result;
                        for (Room room : ro) {
                            Treatment tr = new Treatment("Visitor Consultation", room, selected, phys, visitor);
                            Booking book = new Booking(tr);
                            result = bookingList.addBooking(book);
                            if (result.equalsIgnoreCase("Booking complete")) {
                                System.out.println(result);
                                break;
                            } else if (result.equalsIgnoreCase("You already have a booking at this time")) {
                                System.out.println(result);
                                break;
                            } else {
                                System.out.println(room.getRoom() + " : " + result + " BOOKING FAILED");
                            }
                        }
                    }
                }
                logOption = -1;
            }
        } while (logOption != 0);
    }

}
