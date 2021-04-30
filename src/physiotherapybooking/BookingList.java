/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Arbaaz
 */
public class BookingList {

    private ArrayList<Booking> bookings;
    

    //private ArrayList <Booking> report2;
    public BookingList() {
        bookings = new ArrayList();
        //report2 = new ArrayList();
        loadData();
    }

    public String addBooking(Booking booking) {
        String s = "default";
            for (Booking books : bookings) {
                if (!bookings.isEmpty()) {
                    if (books.getTreatment().getRoom().equals(booking.getTreatment().getRoom())
                            && books.getTreatment().getAppointmentTime().equals(booking.getTreatment().getAppointmentTime())) {
                        s = "Room is not available for selected time";
                        break;
                    }
                    if(books.getTreatment().getAppointmentTime().equals(booking.getTreatment().getAppointmentTime()) &&
                            books.getTreatment().getPatient().getUserID().equals(booking.getTreatment().getPatient().getUserID())){
                        s = "You already have a booking at this time";
                        break;
                        
                    }
                    
                }
            }
            if(s.equalsIgnoreCase("default")){
                bookings.add(booking);
                s = "Booking complete";
                
            }

        
        
        return s;

    }
    
    public String updateBookingAttend(Booking book){
        String s = "";
        for(Booking existing : bookings){
            if(existing.equals(book)){
                if(existing.getStatus().equals(Booking.Status.CANCELLED)){
                    return "Booking cancelled cannot be attended";
                }
                existing.setStatusAttended();
                if(existing.getStatus().equals(Booking.Status.ATTENDED)){
                    return "Booking Attended";
                }
            }
        }
        return "Something went wrong";
    }
    
    public String updateBookingCancel(Booking book){
        String s = "";
        for(Booking existing : bookings){
            if(existing.equals(book)){
                existing.setStatusCancelled();
                if(existing.getStatus().equals(Booking.Status.CANCELLED)){
                    return "Booking Cancelled";
                }
            }
        }
        return "Something went wrong";
    }

    public HashMap getPatientBookings(String userid){
        HashMap<Integer, Booking> patientBookings = new HashMap<Integer, Booking>();
        for(Booking books : bookings){
            if(books.getTreatment().getPatient().getUserID().equalsIgnoreCase(userid)){
                patientBookings.put((patientBookings.size() + 1),books);
            }
        }
        return patientBookings;
    }
    
    public String printReport1() {
        String report = "";
        for (Booking book : bookings) {
            report += border2() + "\n"
                    + book.getTreatment().toString() + "\n"
                    + border2();
        }
        return report;
    }

    public String printReport2() {
        String report = "";
        for (Booking book : bookings) {
            report += border2() + "\n"
                    + book.toString() + "\n"
                    + border2();
        }
        return report;
    }

    private String border2() {
        return("\n===================================\n");
    }


    private void loadData() {
        //String name, Room room, String appointmentTime, Physician physician, Patient patient
        Timetable tm = new Timetable();
        Room room1 = new Room("placeholder1");
        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
        DateTime dt8 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys8.addAppointmentHours(dt8);
        Treatment treat1 = new Treatment("name", room1, phys8.getDateTimeAppointment(1), phys8, pat1);
        Booking book1 = new Booking(treat1);
        addBooking(book1);
    }
}
