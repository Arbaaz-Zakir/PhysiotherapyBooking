/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Arbaaz
 */
public class Physician extends User{
    //ArrayList<LocalDateTime> ConsultationHours;
    HashMap<Integer, LocalDateTime> ConsultationHours;
    
    ArrayList<String> expertise;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    
    public Physician(String userID, String fullName, String address, String telephone){
        super(userID, fullName, address, telephone);
        ConsultationHours = new HashMap<Integer, LocalDateTime>();
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
    
    public void addConsultationHours(LocalDateTime dateTime){
        this.ConsultationHours.put((ConsultationHours.size()+1),dateTime);
    }
    
    public String getConsultationHours(){
        String s = "Consultation Hours: \n";
        for(LocalDateTime hours : ConsultationHours.values()){
            for(int number : ConsultationHours.keySet()){
                s += number + " : "+ hours.format(formatter) + "\n";
            }
        }
        return s;
    }
    
    public LocalDateTime selectTime(int time){
        return ConsultationHours.get(time);
    }
    
    public String toString(){
        return super.toString() + "\n" + getConsultationHours() + "\n" + "*************************" + "\n";
    }
}
