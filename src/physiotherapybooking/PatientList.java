/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;

/**
 * Collection of Patients as a array list
 * @author Arbaaz
 */
public class PatientList {
    private ArrayList<Patient> patientList;
    
    /**
     * create a new a list of patients with pre loaded data
     */
    public PatientList(){
        patientList = new ArrayList(); 
        
        loadData();
    }
    
    /**
     * returns a given Patient by the provided id
     * @param patientID
     * @return Patient
     */
    public Patient getPatientByID(String patientID){
        String s = "";
        for(Patient user : patientList){
            if (user.getUserID().equals(patientID)){
                return user;
            }
        }
        return null;
    }
    
    /**
     * returns a patient and id number as a string
     * @param patientName
     * @return String
     */
    public String getPatientByName(String patientName){
        String s = "";
        for(Patient patient : patientList){
            if (patient.getFullName().equals(patientName)){
                s += patient.getUserID()+ "  " + patient.getFullName() + "\n";
                return s;
            }
        }
        return s;
    }
    
    /**
     * checks of a patient exists
     * @param patientID
     * @return boolean
     */
    public boolean patientExists(String patientID){
        for(Patient patient : patientList){
            if(patient.getUserID().equals(patientID)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * returns patient ArrayList
     * @return ArrayList
     */
    public ArrayList getPatientList(){
        return patientList;
    }
    
    /**
     * adds a patient to the list
     * @param patient 
     */
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    
    /**
     * return size of patient list
     * @return int
     */
    public int getSize() {
        return patientList.size();
    }
    
    /**
     * pre=loads patient data when a patient list is created
     */
    private void loadData(){
        Patient pat1 = new Patient("201", "tp1", "TestData: Address1", "0105467572030");
        patientList.add(pat1);
        
        Patient pat2 = new Patient("202", "tp2", "TestData: Address1", "0106576572030");
        patientList.add(pat2);
        
        Patient pat3 = new Patient("203", "", "TestData: Address1", "089765856102030");
        patientList.add(pat3);
        
        Patient pat4 = new Patient("204", "Arbaaz Zakir", "TestData: Address1", "01508002030");
        patientList.add(pat4);
        
        Patient pat5 = new Patient("205", "Arbaaz Zakir", "TestData: Address1", "0106865865682030");
        patientList.add(pat5);
        
        Patient pat6 = new Patient("206", "Arbaaz Zakir", "TestData: Address1", "01068686586586");
        
        Patient pat7 = new Patient("207", "Arbaaz Zakir", "TestData: Address", "01785686802030");
        patientList.add(pat7);
        
        Patient pat8 = new Patient("208", "Arbaaz Zakir", "TestData: Address", "010435464572030");
        patientList.add(pat8);
        
        Patient pat9 = new Patient("209", "Arbaaz Zakir", "TestData: Address", "01453454302030");
        patientList.add(pat9);
        
        Patient pat10 = new Patient("210", "Arbaaz Zakir", "TestData: Address", "010204450344");
        patientList.add(pat10);
    }

    
}
