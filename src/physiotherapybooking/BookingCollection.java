/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;

/**
 *
 * @author Arbaaz
 */
public class BookingCollection {
    private ArrayList <Booking> bookings;
    //private ArrayList <Booking> report2;
    
    public BookingCollection(){
        bookings = new ArrayList();
        //report2 = new ArrayList();
    }
    
    public String addBooking(Booking booking){
        for(Booking books : bookings){
            if(!bookings.isEmpty()){
                if(books.getTreatment().getRoom().getRoom().equals(booking.getTreatment().getRoom().getRoom())
                        && books.getTreatment().getAppointmentTime().equals(booking.getTreatment().getAppointmentTime())){
                    return("Room Booked at selected time, this booking is unavailable");
                }
            }
        }
        this.bookings.add(booking);
        return "Booking complete";
            
   
    }
    
    
    
//    public void addReport2(Booking booking){
//        this.report2.add(booking);
//    }
    
    public String printReport1(){
        String report = "";
        for(Booking book : bookings){
            report += border2() + "\n" +
            book.getTreatment().toString() + "\n" +
            border2();
        }
        return report;
    }
    
    public String printReport2(){
        String report = "";
        for(Booking book : bookings){
            report += border2() + "\n" +
            book.toString() + "\n" +
            border2();
        }
        return report;
    }
    
    private void border(){
        System.out.println("\n===================================\n");
    }
    
    private String border2(){
        return"===================================";
    }
}
