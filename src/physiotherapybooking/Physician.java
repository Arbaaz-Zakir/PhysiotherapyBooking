/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Arbaaz
 */
public class Physician extends User{
    LocalDateTime[] ConsultationHours;
    // expertise
    
    public Physician(String fullName, String address, String telephone){
        super(fullName, address, telephone);
        ConsultationHours = new LocalDateTime[10];
        
    }
}
