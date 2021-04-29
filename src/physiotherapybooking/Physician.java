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
public class Physician extends Personnel{
    //ArrayList<LocalDateTime> appointmentHours;
    private HashMap<Integer, String> appointmentHours;
    private String[] consultation;
    private ArrayList<String> expertise;
    
    //private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    
    
    public Physician(String userID, String fullName, String address, String telephone){
        super(userID, fullName, address, telephone);
        appointmentHours = new HashMap<Integer, String>();
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
    
    public void addAppointmentHours(String time){
        this.appointmentHours.put((appointmentHours.size()+1),time);
    }
    
    public String getAppointmentHours(){
        String s = "Appointment Hours: \n";
        for(String hours : appointmentHours.values()){
            for(int number : appointmentHours.keySet()){
                s += number + " : "+ hours + "\n";
            }
        }
        return s;
    }
    
    public String getTime(int time){
        if(this.appointmentHours.containsKey(time)){
            return appointmentHours.get(time);
        }
        else{
            return null;
        }
    }
    
    public String toString(){
        return super.toString() + "\n" + getAppointmentHours() + "\n" + "*************************" + "\n";
    }
}
