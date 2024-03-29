/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * collection of bookings as a array list
 *
 * @author Arbaaz
 */
public class BookingList {

    private ArrayList<Booking> bookings;

    /**
     * create a new booking list with pre loaded data
     */
    public BookingList() {
        bookings = new ArrayList();
        //report2 = new ArrayList();
        //loadData();
    }

    /**
     * adds a booking if there is a room at the time requested and if the
     * patient does not already have another booking at the same time
     *
     * @param booking
     * @return String if booking was successful or not
     */
    public String addBooking(Booking booking) {
        String s = "default";
        for (Booking books : bookings) {
            if (!bookings.isEmpty()) {
                if (books.getTreatment().getRoom().equals(booking.getTreatment().getRoom())
                        && books.getTreatment().getAppointmentTime().equals(booking.getTreatment().getAppointmentTime())) {
                    s = "Room is not available for selected time";
                    break;
                }
                if (books.getTreatment().getAppointmentTime().equals(booking.getTreatment().getAppointmentTime())
                        && books.getTreatment().getPatient().getUserID().equals(booking.getTreatment().getPatient().getUserID())) {
                    s = "You already have a booking at this time";
                    break;

                }

            }
        }
        if (s.equalsIgnoreCase("default")) {
            booking.getTreatment().getAppointmentTime().setAvailable(false);
            bookings.add(booking);
            s = "Booking complete";

        }

        return s;

    }

    /**
     * changes a booking status to attended of not cancelled
     *
     * @param booking
     * @return String if Booking was successfully attended
     */
    public String updateBookingAttend(Booking booking) {
        String s = "";
        for (Booking existing : bookings) {
            if (existing.equals(booking)) {
                if (existing.getStatus().equals(Booking.Status.CANCELLED)) {
                    return "Booking cancelled cannot be attended";
                }
                existing.setStatusAttended();
                if (existing.getStatus().equals(Booking.Status.ATTENDED)) {
                    return "Booking Attended";
                }
            }
        }
        return "Something went wrong";
    }

    /**
     * changes a booking status to cancelled
     *
     * @param book
     * @return String if successful
     */
    public String updateBookingCancel(Booking book) {
        String s = "";
        for (Booking existing : bookings) {
            if (existing.equals(book)) {
                existing.setStatusCancelled();
                if (existing.getStatus().equals(Booking.Status.CANCELLED)) {
                    existing.getTreatment().getAppointmentTime().setAvailable(true);
                    return "Booking Cancelled";
                }
            }
        }
        return "Something went wrong";
    }

    public String updateBookingChanged(Booking book, Treatment treatment) {
        String s = "";
        for (Booking existing : bookings) {
            if (existing.equals(book)) {
                existing.setTreatment(treatment);
                existing.setStatusChanged();
                if (existing.getStatus().equals(Booking.Status.CHANGED)) {
                    return "Booking Changed";
                }
            }
        }
        return "Something went wrong";
    }

    /**
     * gets all of a patients bookings
     *
     * @param userid
     * @return
     */
    public HashMap getPatientBookings(String userid) {
        HashMap<Integer, Booking> patientBookings = new HashMap<Integer, Booking>();
        for (Booking books : bookings) {
            if (books.getTreatment().getPatient().getUserID().equalsIgnoreCase(userid)) {
                patientBookings.put((patientBookings.size() + 1), books);
            }
        }
        return patientBookings;
    }

    /**
     * returns report1 of the bookings
     *
     * @return String
     */
    public String printReport1() {
        String report = "";
        for (Booking book : bookings) {
            report += border() + "\n"
                    + book.getTreatment().toString() + "\n"
                    + border();
        }
        return report;
    }

    /**
     * returns report 2 of the bookings
     *
     * @return String
     */
    public String printReport2(PatientList pl) {
        String report = "";
        ArrayList<Patient> list = pl.getPatientList();
        for (Patient patient : list) {
            for (Booking book : bookings) {
                if (patient.getUserID().equalsIgnoreCase(book.getTreatment().getPatient().getUserID())) {
                    report += border() + "\n"
                            + book.toString() + "\n"
                            + border();
                }
            }
        }
        return report;
    }

    /**
     * returns a border
     *
     * @return String
     */
    private String border() {
        return ("\n===================================\n");
    }

    public void initBookingsData(Timetable time, PhysicianList phyList, RoomsList rooms, PatientList pat) {
        loadData(time, phyList, rooms, pat);
    }

    /**
     * loads data of bookings
     */
    private void loadData(Timetable tm, PhysicianList phyList, RoomsList rooms, PatientList patient) {
        //String name, Room room, String appointmentTime, Physician physician, Patient patient
//        ArrayList<Room> ro = rooms.getRoomList();
//        rooms.getRoomList();
//        
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        //phys8.addAppointmentHours(dt8);
//        //Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        //Booking book1 = new Booking(treat1);
//        //addBooking(book1);

//        for (Room room : ro) {
//            Treatment tr = new Treatment(phyList.getAPhysicianByName("bob").getExpertise(0), room, dt8, phyList.getAPhysicianByName("bob"), patient.getPatientByID("201"));
//            Booking book = new Booking(tr);
//            String result = this.bookings.add(book);
//            if (result.equalsIgnoreCase("Booking complete")) {
//                System.out.println(result);
//                break;
//            } else if (result.equalsIgnoreCase("You already have a booking at this time")) {
//                System.out.println(result);
//                break;
//            } else {
//                System.out.println(room.getRoom() + " : " + result + " BOOKING FAILED");
//            }
//        }
//        
//        Room room1 = new Room("placeholder1");
//        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        phys8.addAppointmentHours(dt8);
//        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        Booking book1 = new Booking(treat1);
//        addBooking(book1);
//        
//        Room room1 = new Room("placeholder1");
//        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        phys8.addAppointmentHours(dt8);
//        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        Booking book1 = new Booking(treat1);
//        addBooking(book1);
//        
//        Room room1 = new Room("placeholder1");
//        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        phys8.addAppointmentHours(dt8);
//        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        Booking book1 = new Booking(treat1);
//        addBooking(book1);
//        
//        Room room1 = new Room("placeholder1");
//        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        phys8.addAppointmentHours(dt8);
//        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        Booking book1 = new Booking(treat1);
//        addBooking(book1);
//        
//        Room room1 = new Room("placeholder1");
//        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
//        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
//        DateTime dt8 = new DateTime(tm.getDay(0), Timetable.TWOOCLOCK);
//        phys8.addAppointmentHours(dt8);
//        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
//        Booking book1 = new Booking(treat1);
//        addBooking(book1);

    }
}
