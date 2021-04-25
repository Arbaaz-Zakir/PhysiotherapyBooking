/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Arbaaz
 */
public class PhysicianList {
    ArrayList<Physician> physicianList;
    
    public PhysicianList(){
        physicianList = new ArrayList(); 
        
        Physician xx = new Physician("222", "bob", "26 dorset park", "5476468");
        physicianList.add(xx); 
        xx.addExpertise("accupunture");
        xx.addConsultationHours(LocalDateTime.of(2020, Month.MARCH, 01, 13, 29));
    }
    
    public ArrayList<Physician> getPhysiciansByExpertise(String physicianExpertise){
        ArrayList<Physician> search = new ArrayList(); 
        String s = "";
        for(Physician phys : physicianList){
            ArrayList<String> selectedPhysicianExpertiseList= phys.getExpertiseList();
            for(String aExpertise : selectedPhysicianExpertiseList){
                if(aExpertise.equals(physicianExpertise)){
                    search.add(phys);
                    s += phys.toString();
                }
            }
        }
        return search;
    }
    
    public String getPhysiciansByName(String name){
        String search = "";
        for(Physician phys : physicianList){
            if(phys.getFullName().equalsIgnoreCase(name)){
                search += phys.getFullName() + "\n" + phys.getAppointmentHours() + "\n\n";
            }
        }
        
        return search;
    }
    
    public Physician getAPhysicianByName(String name){
        for(Physician phys : physicianList){
            if(phys.getFullName().equalsIgnoreCase(name)){
                return phys;
            }
        }
        return null;
    }
    
    public ArrayList getPhysicianList(){
        return physicianList;
    }
    
    public void addPhysicianToList(Physician physician){
        physicianList.add(physician);
    }
    
    public boolean physicianExists(String name){
        for(Physician phys : physicianList){
            if(phys.getFullName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
