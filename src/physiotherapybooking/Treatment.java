/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
import java.time.LocalDateTime;
/**
 *
 * @author Arbaaz
 */
public class Treatment {
    private String name;
    Room room;
    LocalDateTime appointmentTime;
    Physician physician;
    
    public Treatment(String name, Room room, LocalDateTime appointmentTime, Physician physician){
        this.name = name;
        this.room = room;
        this.appointmentTime = appointmentTime;
        this.physician = physician;
    }
    
    
}
