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
public class PatientList {
    private ArrayList<Patient> patientList;
    
    public PatientList(){
        patientList = new ArrayList(); 
    }
    
    public User getPatientByID(String patientID){
        String s = "";
        for(User user : patientList){
            if (user.getUserID().equals(patientID)){
                return user;
            }
        }
        return null;
    }
    
    public String getPatientByName(String patientName){
        String s = "";
        for(User users : patientList){
            if (users.getFullName().equals(patientName)){
                s += users.getUserID()+ "  " + users.getFullName() + "\n";
            }
        }
        return s;
    }
    
    public boolean patientExists(String patientID){
        for(User users : patientList){
            if(users.getUserID().equals(patientID)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList getPatientList(){
        return patientList;
    }
    
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
}
