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
     
     Treatment treatment;
     Status status;
     
     public Booking(Treatment treament){
         this.treatment = treatment;
         status = status.BOOKED;
     }
     
     public void setStatus(Status status){
         this.status = status;
     }
     
     public Status getStatus(){
         return status;
     }
     
     public String toString(){
         String string = "";
         return string;
     }
}
