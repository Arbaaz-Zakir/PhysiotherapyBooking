/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author Arbaaz
 */
public class Physician extends User{
    LocalDateTime[] ConsultationHours;
    ArrayList<String> expertise;
    
    public Physician(String fullName, String address, String telephone){
        super(fullName, address, telephone);
        ConsultationHours = new LocalDateTime[10];
        expertise = new ArrayList();
    }
    
    public void addExpertise(String expertise){
        this.expertise.add(expertise);
    }
    
    public String getExpertise(String expertise){
        for(String exp : this.expertise){
            if(exp.equals(expertise)){
                return expertise;
            }
        }
        return "No expertise";
    }
    
    public String getAllExpertise(){
        String s = "";
        for(String expertise : expertise){
            s += expertise + "\n";
        }
        return s;
    }
    
    public ArrayList getExpertiseList(){
        return expertise;
    }
    
    public String getConsultationHours(){
        String s = "Consultation Hours: \n";
        for(int i = 0; i <= ConsultationHours.length; i++){
            s += ConsultationHours[i] + "\n";
        }
        return s;
    }
    
    public String toString(){
        return super.toString() + "\n" + getConsultationHours();
    }
}
