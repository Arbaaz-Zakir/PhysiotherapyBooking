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
        
        loadData();
    }
    
    public Patient getPatientByID(String patientID){
        String s = "";
        for(Patient user : patientList){
            if (user.getUserID().equals(patientID)){
                return user;
            }
        }
        return null;
    }
    
    public String getPatientByName(String patientName){
        String s = "";
        for(Patient patient : patientList){
            if (patient.getFullName().equals(patientName)){
                s += patient.getUserID()+ "  " + patient.getFullName() + "\n";
            }
        }
        return s;
    }
    
    public boolean patientExists(String patientID){
        for(Patient patient : patientList){
            if(patient.getUserID().equals(patientID)){
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
    
    private void loadData(){
        Patient pat1 = new Patient("201", "Arbaaz Zakir", "TestData: Address", "0102030");
        patientList.add(pat1);
        
        Patient pat2 = new Patient("202", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat2);
        
        Patient pat3 = new Patient("203", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat3);
        
        Patient pat4 = new Patient("204", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat4);
        
        Patient pat5 = new Patient("205", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat5);
        
        Patient pat6 = new Patient("206", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat6);
        
        Patient pat7 = new Patient("207", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat7);
        
        Patient pat8 = new Patient("208", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat8);
        
        Patient pat9 = new Patient("209", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat9);
        
        Patient pat10 = new Patient("210", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        patientList.add(pat10);
    }

    public int getSize() {
        return patientList.size();
    }
}
