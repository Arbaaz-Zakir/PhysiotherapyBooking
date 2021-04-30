/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 * Booking class stores the treatment and the status of th the treatment
 * class allows to also change the status of the booking
 * @author Arbaaz
 */
public class Booking {

    /**
     * Status  enum, bookings can be attended, booked, or cancelled
     */
     enum Status{
         ATTENDED,
         BOOKED,
         CANCELLED
     }
     
     private Treatment treatment;
     private Status status;
     
     /**
      * creates a new booking taking a treatment and setting the status to booked by default
      * @param treatment 
      */
     public Booking(Treatment treatment){
         this.treatment = treatment;
         status = status.BOOKED;
     }
     
     /**
      * sets booking status to attended
      */
     public void setStatusAttended(){
         this.status = Booking.Status.ATTENDED;
     }
     
     /**
      * sets booking status to cancelled
      */
     public void setStatusCancelled(){
         this.status = Booking.Status.CANCELLED;
     }
     
     /**
      * returns the status of the booking
      * @return 
      */
     public Status getStatus(){
         return status;
     }
     
     /**
      * return toString for booking
      * @return toString of Booking
      */
     public String toString(){
         String string = "";
         string += this.getTreatment().toString() + 
                 "\nStatus: " + getStatus();
         return string;
     }

    /**
     * @return the treatment
     */
    public Treatment getTreatment() {
        return treatment;
    }

    /**
     * allows ti change the booking of the treatment
     * @param treatment the treatment to set
     */
    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
