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
        Timetable tm = new Timetable();
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        physicianList.add(phys1); 
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime(tm.getDay(0) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        DateTime dtc1 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys1.addConsultation(dtc1);
        
        
        Physician phys2 = new Physician("002", "mike", "26 dorset park", "5476468");
        physicianList.add(phys2); 
        phys2.addExpertise("Osteopathy");
        DateTime dt2 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addAppointmentHours(dt2);
        
        DateTime dtc2 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc2);
        
        
        Physician phys3 = new Physician("003", "john", "26 dorset park", "5476468");
        physicianList.add(phys3); 
        phys3.addExpertise("Rehabilitation");
        DateTime dt3 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys3.addAppointmentHours(dt3);
        
        DateTime dtc3 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc3);
        
        
        Physician phys4 = new Physician("004", "drew", "26 dorset park", "5476468");
        physicianList.add(phys4); 
        phys4.addExpertise("accupunture");
        DateTime dt4 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys4.addAppointmentHours(dt4);
        
        DateTime dtc4 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc4);
        
        
        Physician phys5 = new Physician("005", "stella", "26 dorset park", "5476468");
        physicianList.add(phys5); 
        phys5.addExpertise("Physiotherapy");
        DateTime dt5 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys5.addAppointmentHours(dt5);
        
        DateTime dtc5 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc5);
        
        
        
        Physician phys6 = new Physician("006", "tristana", "26 dorset park", "5476468");
        physicianList.add(phys6); 
        phys6.addExpertise("Osteopathy");
        DateTime dt6 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys6.addAppointmentHours(dt6);
        
        DateTime dtc6 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc6);
        
        
        Physician phys7 = new Physician("007", "ana", "26 dorset park", "5476468");
        physicianList.add(phys7); 
        phys7.addExpertise("Rehabilitation");
        DateTime dt7 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys7.addAppointmentHours(dt7);
        
        DateTime dtc7 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc7);
        
        
        Physician phys8 = new Physician("008", "mary", "26 dorset park", "5476468");
        physicianList.add(phys8); 
        phys8.addExpertise("accupunture");
        DateTime dt8 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys8.addAppointmentHours(dt8);
        
        DateTime dtc8 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc8);
        
        
        Physician phys9 = new Physician("009", "carol", "26 dorset park", "5476468");
        physicianList.add(phys9); 
        phys9.addExpertise("accupunture");
        phys9.addExpertise("Rehabilitation");
        DateTime dt9 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys9.addAppointmentHours(dt9);
        
        DateTime dtc9 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc9);
        
        
        Physician phys10 = new Physician("010", "damien", "26 dorset park", "5476468");
        physicianList.add(phys10); 
        phys10.addExpertise("accupunture");
        phys10.addExpertise("Physiotherapy");
        DateTime dt10 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys10.addAppointmentHours(dt10);
        
        DateTime dtc10 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc10);
        
    }
}
