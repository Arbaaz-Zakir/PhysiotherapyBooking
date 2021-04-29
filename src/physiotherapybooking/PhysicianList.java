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
    private ArrayList<Physician> physicianList;
    
    public PhysicianList(){
        physicianList = new ArrayList(); 
        loadData();
        
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
    
    private void loadData(){
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        physicianList.add(phys1); 
        phys1.addExpertise("Physiotherapy");
        phys1.addAppointmentHours(Timetable.ONEOCLOCK);
        
        Physician phys2 = new Physician("002", "mike", "26 dorset park", "5476468");
        physicianList.add(phys2); 
        phys2.addExpertise("Osteopathy");
        phys2.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys3 = new Physician("003", "john", "26 dorset park", "5476468");
        physicianList.add(phys3); 
        phys3.addExpertise("Rehabilitation");
        phys3.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys4 = new Physician("004", "drew", "26 dorset park", "5476468");
        physicianList.add(phys4); 
        phys4.addExpertise("accupunture");
        phys4.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys5 = new Physician("005", "stella", "26 dorset park", "5476468");
        physicianList.add(phys5); 
        phys5.addExpertise("Physiotherapy");
        phys5.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys6 = new Physician("006", "tristana", "26 dorset park", "5476468");
        physicianList.add(phys6); 
        phys6.addExpertise("Osteopathy");
        phys6.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys7 = new Physician("007", "ana", "26 dorset park", "5476468");
        physicianList.add(phys7); 
        phys7.addExpertise("Rehabilitation");
        phys7.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
        physicianList.add(phys8); 
        phys8.addExpertise("accupunture");
        phys8.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys9 = new Physician("009", "carol", "26 dorset park", "5476468");
        physicianList.add(phys9); 
        phys9.addExpertise("accupunture");
        phys9.addExpertise("Rehabilitation");
        phys9.addAppointmentHours(Timetable.TWOOCLOCK);
        
        Physician phys10 = new Physician("010", "damien", "26 dorset park", "5476468");
        physicianList.add(phys10); 
        phys10.addExpertise("accupunture");
        phys10.addExpertise("Physiotherapy");
        phys10.addAppointmentHours(Timetable.TWOOCLOCK);
    }
}
