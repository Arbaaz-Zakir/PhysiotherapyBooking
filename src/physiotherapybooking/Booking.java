/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 *
 * @author Arbaaz
 */
public class Booking {
    //physician check
    //datetime check
    //status check
     enum Status{
         ATTENDED,
         BOOKED,
         CANCELLED
     }
     
     private Treatment treatment;
     private Status status;
     
     public Booking(Treatment treatment){
         this.treatment = treatment;
         status = status.BOOKED;
     }
     
     public void setStatusAttended(){
         this.status = Booking.Status.ATTENDED;
     }
     
     public void setStatusCancelled(){
         this.status = Booking.Status.CANCELLED;
     }
     
     public Status getStatus(){
         return status;
     }
     
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
     * @param treatment the treatment to set
     */
    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
