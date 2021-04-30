/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Physician extends Personnel
 * @author Arbaaz
 */
public class Physician extends Personnel{
    //ArrayList<LocalDateTime> appointmentHours;
    private HashMap<Integer, DateTime> appointmentHours;
    private HashMap<Integer, DateTime> consultation;
    //private String[] consultation;
    private ArrayList<String> expertise;
    
    //private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    
    /**
     * creates a new Physician
     * @param userID
     * @param fullName
     * @param address
     * @param telephone 
     */
    public Physician(String userID, String fullName, String address, String telephone){
        super(userID, fullName, address, telephone);
        appointmentHours = new HashMap<Integer, DateTime>();
        expertise = new ArrayList();
        consultation = new HashMap<Integer, DateTime>();
    }
    
    /**
     * add expertise 
     * @param expertise 
     */
    public void addExpertise(String expertise){
        this.expertise.add(expertise);
    }
    
    /**
     * returns a physician specific expertise
     * @param expertise
     * @return 
     */
    public String getExpertise(String expertise){
        for(String exp : this.expertise){
            if(exp.equals(expertise)){
                return expertise;
            }
        }
        return "No expertise";
    }
    
    /**
     * returns all of a physician expertise
     * @return String
     */
    public String getAllExpertise(){
        String s = "";
        for(String expertise : expertise){
            s += expertise + "\n";
        }
        return s;
    }
    
    /**
     * returns physicians expertise arraylist
     * @return ArrayList
     */
    public ArrayList getExpertiseList(){
        return expertise;
    }
    
    /**
     * adds a new appointment time to a physician
     * @param time 
     */
    public void addAppointmentHours(DateTime time){
        this.appointmentHours.put((appointmentHours.size()+1),time);
    }
    
    /**
     * returns a physicians appointment times
     * @return String
     */
    public String getAppointmentHours(){
        String s = "Appointment Hours: \n";
        for(DateTime hours : appointmentHours.values()){
            for(int number : appointmentHours.keySet()){
                s += number + " : "+ hours + "\n";
            }
        }
        return s;
    }
    
    public DateTime getDateTimeAppointment(int time){
        if(this.appointmentHours.containsKey(time)){
            return appointmentHours.get(time);
        }
        else{
            return null;
        }
    }
    
    /**
     * a specified DateTime 
     * @param time a int
     * @return DateTime
     */
    public DateTime getDateTimeConsultation(int time){
        if(this.consultation.containsKey(time)){
            return consultation.get(time);
        }
        else{
            return null;
        }
    }
    
    /**
     * adds a new consultation time
     * @param time a DateTime
     */
    public void addConsultation(DateTime time){
        this.consultation.put((consultation.size()+1),time);
    }
    
    /**
     * reurns all a physicians consultation hours
     * @return 
     */
    public String getConsultation(){
        String s = "Consultation Hours: \n";
        for(DateTime hours : consultation.values()){
            for(int number : consultation.keySet()){
                s += number + " : "+ hours + "\n";
            }
        }
        return s;
    }
    
    /**
     * toString for a physician
     * @return String 
     */
    public String toString(){
        return super.toString() + "\n" + getAppointmentHours() + "\n" + "*************************" + "\n";
    }
}
