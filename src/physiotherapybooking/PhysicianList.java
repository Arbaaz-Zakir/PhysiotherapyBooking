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
 * Physician List class stores physician
 * @author Arbaaz
 */
public class PhysicianList {
    private ArrayList<Physician> physicianList;
    
    /**
     * creates a new physician list with pre loaded data
     */
    public PhysicianList(){
        physicianList = new ArrayList(); 
        //loadData();
        
    }
    
    /**
     * returns a list of physicians who share a specified expertise
     * @param physicianExpertise
     * @return search
     */
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
    
    /**
     * get all physician with the same name
     * @param name
     * @return 
     */
    public String getPhysiciansByName(String name){
        String search = "";
        for(Physician phys : physicianList){
            if(phys.getFullName().equalsIgnoreCase(name)){
                search += phys.getFullName() + "\n" + phys.getAppointmentHours() + "\n\n";
            }
        }
        
        return search;
    }
    
    public void physicianListLoad(Timetable tm){
        loadData(tm);
    }
    
    /**
     * returns a physician via a specified name 
     * @param name
     * @return Physician
     */
    public Physician getAPhysicianByName(String name){
        for(Physician phys : physicianList){
            if(phys.getFullName().equalsIgnoreCase(name)){
                return phys;
            }
        }
        return null;
    }
    
    /**
     * returns the list of physicians
     * @return ArrayList physicianList
     */
    public ArrayList getPhysicianList(){
        return physicianList;
    }
    
    /**
     * adds a new physician to the list
     * @param physician 
     */
    public void addPhysicianToList(Physician physician){
        physicianList.add(physician);
    }
    
    /**
     * checks if a physician with a given name exists
     * @param name
     * @return boolean
     */
    public boolean physicianExists(String name){
        for(Physician phys : physicianList){
            if(phys.getFullName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * pre-loads data when a physician list is created
     */
    private void loadData(Timetable tm){
        //Timetable tm = new Timetable();
        Physician phys1 = new Physician("001", "bob", "26 dorset park", "5476468");
        
        phys1.addExpertise("Physiotherapy");
        DateTime dt = new DateTime(tm.getDay(0) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt);
        
        DateTime dt2 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys1.addAppointmentHours(dt2);
        physicianList.add(phys1); 
        
        DateTime dt3 = new DateTime(tm.getDay(1) ,Timetable.FOUROCLOCK);
        phys1.addAppointmentHours(dt3);
        
        DateTime dt4 = new DateTime(tm.getDay(1) ,Timetable.FIVEOCLOCK);
        phys1.addAppointmentHours(dt4);
        
        DateTime dt5 = new DateTime(tm.getDay(2) ,Timetable.THREEOCLOCK);
        phys1.addAppointmentHours(dt5);
        
        DateTime dt6 = new DateTime(tm.getDay(2) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt6);
        
        DateTime dt7 = new DateTime(tm.getDay(5) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt7);
        
        DateTime dt8 = new DateTime(tm.getDay(5) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt8);
        
        DateTime dt9 = new DateTime(tm.getDay(6) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt9);
        
        DateTime dt10 = new DateTime(tm.getDay(6) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt10);
        
        DateTime dt11 = new DateTime(tm.getDay(7) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt11);
        
        DateTime dt12 = new DateTime(tm.getDay(7) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt12);
        
        DateTime dt13 = new DateTime(tm.getDay(8) ,Timetable.TWOOCLOCK);
        phys1.addAppointmentHours(dt13);
        
        DateTime dt14 = new DateTime(tm.getDay(8) ,Timetable.THREEOCLOCK);
        phys1.addAppointmentHours(dt14);
        
        DateTime dt15 = new DateTime(tm.getDay(9) ,Timetable.ONEOCLOCK);
        phys1.addAppointmentHours(dt15);
        
        DateTime dt16 = new DateTime(tm.getDay(9) ,Timetable.TWOOCLOCK);
        phys1.addAppointmentHours(dt16);
        
        DateTime dt17 = new DateTime(tm.getDay(11) ,Timetable.THREEOCLOCK);
        phys1.addAppointmentHours(dt17);
        
        DateTime dt18 = new DateTime(tm.getDay(11) ,Timetable.FOUROCLOCK);
        phys1.addAppointmentHours(dt18);
        
        DateTime dt19 = new DateTime(tm.getDay(12) ,Timetable.FOUROCLOCK);
        phys1.addAppointmentHours(dt19);
        
        DateTime dt20 = new DateTime(tm.getDay(12) ,Timetable.FIVEOCLOCK);
        phys1.addAppointmentHours(dt20);
        
        
        
        DateTime dtc1 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys1.addConsultation(dtc1);
        
     //////////////////////////////////////////////////////////////////////////////////////////////   
        Physician phys2 = new Physician("002", "mike", "26 dorset park", "5476468");
        physicianList.add(phys2); 
        phys2.addExpertise("Osteopathy");
        DateTime dt21 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addAppointmentHours(dt21);
        
        DateTime dt22 = new DateTime(tm.getDay(0) ,Timetable.FOUROCLOCK);
        phys2.addAppointmentHours(dt22);
        
        DateTime dt23 = new DateTime(tm.getDay(1) ,Timetable.SEVENOCLOCK);
        phys2.addAppointmentHours(dt23);
        
        DateTime dt24 = new DateTime(tm.getDay(1) ,Timetable.SIXOCLOCK);
        phys2.addAppointmentHours(dt24);
        
        DateTime dt25 = new DateTime(tm.getDay(2) ,Timetable.TWOOCLOCK);
        phys2.addAppointmentHours(dt25);
        
        DateTime dt26 = new DateTime(tm.getDay(2) ,Timetable.ONEOCLOCK);
        phys2.addAppointmentHours(dt26);
        
        DateTime dt27 = new DateTime(tm.getDay(3) ,Timetable.FIVEOCLOCK);
        phys2.addAppointmentHours(dt27);
        
        DateTime dt28 = new DateTime(tm.getDay(3) ,Timetable.SIXOCLOCK);
        phys2.addAppointmentHours(dt28);
        
        DateTime dt29 = new DateTime(tm.getDay(4) ,Timetable.FOUROCLOCK);
        phys2.addAppointmentHours(dt29);
        
        DateTime dt30 = new DateTime(tm.getDay(5) ,Timetable.FIVEOCLOCK);
        phys2.addAppointmentHours(dt30);
        
        DateTime dt31 = new DateTime(tm.getDay(6) ,Timetable.TWOOCLOCK);
        phys2.addAppointmentHours(dt21);
        
        DateTime dt32 = new DateTime(tm.getDay(7) ,Timetable.THREEOCLOCK);
        phys2.addAppointmentHours(dt32);
        
        DateTime dt33 = new DateTime(tm.getDay(7) ,Timetable.SIXOCLOCK);
        phys2.addAppointmentHours(dt33);
        
        DateTime dt34 = new DateTime(tm.getDay(9) ,Timetable.SEVENOCLOCK);
        phys2.addAppointmentHours(dt34);
        
        DateTime dt35 = new DateTime(tm.getDay(12) ,Timetable.ONEOCLOCK);
        phys2.addAppointmentHours(dt35);
        
        DateTime dt36 = new DateTime(tm.getDay(12) ,Timetable.TWOOCLOCK);
        phys2.addAppointmentHours(dt36);
        
        
        
        
        
        
        DateTime dtc2 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys2.addConsultation(dtc2);
     ////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        Physician phys3 = new Physician("003", "john", "26 dorset park", "5476468");
//        physicianList.add(phys3); 
//        phys3.addExpertise("Rehabilitation");
//        DateTime dt3 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys3.addAppointmentHours(dt3);
//        
//        DateTime dtc3 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys2.addConsultation(dtc3);
//        
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Physician phys4 = new Physician("004", "drew", "26 dorset park", "5476468");
//        physicianList.add(phys4); 
//        phys4.addExpertise("accupunture");
//        DateTime dt4 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys4.addAppointmentHours(dt4);
//        
//        DateTime dtc4 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys2.addConsultation(dtc4);
//        
////////////////////////////////////////////////////////////////////////////////////////////////////////// 
//        Physician phys5 = new Physician("005", "stella", "26 dorset park", "5476468");
//        physicianList.add(phys5); 
//        phys5.addExpertise("Physiotherapy");
//        DateTime dt5 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys5.addAppointmentHours(dt5);
//        
//        DateTime dtc5 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
//        phys2.addConsultation(dtc5);
        
        
        
        
        
    }
}
