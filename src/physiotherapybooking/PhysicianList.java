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
        DateTime dtc2 = new DateTime(tm.getDay(5) ,Timetable.TWOOCLOCK);
        phys1.addConsultation(dtc2);
        DateTime dtc3 = new DateTime(tm.getDay(11) ,Timetable.TWOOCLOCK);
        phys1.addConsultation(dtc3);
        DateTime dtc4 = new DateTime(tm.getDay(17) ,Timetable.TWOOCLOCK);
        phys1.addConsultation(dtc4);
        
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
        
        
        
        
        
        
        DateTime dtc5 = new DateTime(tm.getDay(0) ,Timetable.FOUROCLOCK);
        phys2.addConsultation(dtc5);
        DateTime dtc6 = new DateTime(tm.getDay(5) ,Timetable.FOUROCLOCK);
        phys2.addConsultation(dtc6);
        DateTime dtc7 = new DateTime(tm.getDay(11) ,Timetable.FOUROCLOCK);
        phys2.addConsultation(dtc7);
        DateTime dtc8 = new DateTime(tm.getDay(17) ,Timetable.FOUROCLOCK);
        phys2.addConsultation(dtc8);
     ////////////////////////////////////////////////////////////////////////////////////////////////
//        
        Physician phys3 = new Physician("003", "john", "26 dorset park", "5476468");
        physicianList.add(phys3); 
        phys3.addExpertise("Rehabilitation");
        DateTime dt37 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys3.addAppointmentHours(dt37);
        
        DateTime dt38 = new DateTime(tm.getDay(0) ,Timetable.THREEOCLOCK);
        phys3.addAppointmentHours(dt38);
        
        DateTime dt39 = new DateTime(tm.getDay(2) ,Timetable.FOUROCLOCK);
        phys3.addAppointmentHours(dt39);
        
        DateTime dt40 = new DateTime(tm.getDay(5) ,Timetable.FOUROCLOCK);
        phys3.addAppointmentHours(dt40);
        
        DateTime dt41 = new DateTime(tm.getDay(5) ,Timetable.SIXOCLOCK);
        phys3.addAppointmentHours(dt41);
        
        DateTime dt42 = new DateTime(tm.getDay(7) ,Timetable.SIXOCLOCK);
        phys3.addAppointmentHours(dt42);
        
        DateTime dt43 = new DateTime(tm.getDay(7) ,Timetable.SEVENOCLOCK);
        phys3.addAppointmentHours(dt43);
        
        DateTime dt44 = new DateTime(tm.getDay(10) ,Timetable.ONEOCLOCK);
        phys3.addAppointmentHours(dt44);
        
        DateTime dt45 = new DateTime(tm.getDay(10) ,Timetable.FIVEOCLOCK);
        phys3.addAppointmentHours(dt45);
        
        DateTime dt46 = new DateTime(tm.getDay(13) ,Timetable.SIXOCLOCK);
        phys3.addAppointmentHours(dt46);
    
        
        DateTime dtc9 = new DateTime(tm.getDay(0) ,Timetable.SEVENOCLOCK);
        phys3.addConsultation(dtc9);
        DateTime dtc10 = new DateTime(tm.getDay(5) ,Timetable.SEVENOCLOCK);
        phys3.addConsultation(dtc10);
        DateTime dtc11 = new DateTime(tm.getDay(11) ,Timetable.SEVENOCLOCK);
        phys3.addConsultation(dtc11);
        DateTime dtc12 = new DateTime(tm.getDay(17) ,Timetable.SEVENOCLOCK);
        phys3.addConsultation(dtc12);
//        
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        Physician phys4 = new Physician("004", "drew", "26 dorset park", "5476468");
        physicianList.add(phys4); 
        phys4.addExpertise("accupunture");
        DateTime dt47 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys4.addAppointmentHours(dt47);
        
        DateTime dt48 = new DateTime(tm.getDay(5) ,Timetable.ONEOCLOCK);
        phys4.addAppointmentHours(dt48);
        
        DateTime dt49 = new DateTime(tm.getDay(5) ,Timetable.TWOOCLOCK);
        phys4.addAppointmentHours(dt49);
        
        DateTime dt50 = new DateTime(tm.getDay(10) ,Timetable.SIXOCLOCK);
        phys4.addAppointmentHours(dt50);
        
        DateTime dt51 = new DateTime(tm.getDay(10) ,Timetable.SEVENOCLOCK);
        phys4.addAppointmentHours(dt51);
        
        DateTime dt52 = new DateTime(tm.getDay(13) ,Timetable.TWOOCLOCK);
        phys4.addAppointmentHours(dt52);
        
        DateTime dt53 = new DateTime(tm.getDay(13) ,Timetable.THREEOCLOCK);
        phys4.addAppointmentHours(dt53);
        
        DateTime dt54 = new DateTime(tm.getDay(19) ,Timetable.SEVENOCLOCK);
        phys4.addAppointmentHours(dt54);
        
        DateTime dt55 = new DateTime(tm.getDay(20) ,Timetable.TWOOCLOCK);
        phys4.addAppointmentHours(dt55);
        
        DateTime dt56 = new DateTime(tm.getDay(21) ,Timetable.FOUROCLOCK);
        phys4.addAppointmentHours(dt56);
        

        
        
        DateTime dtc13 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys4.addConsultation(dtc13);
        DateTime dtc14 = new DateTime(tm.getDay(5) ,Timetable.TWOOCLOCK);
        phys4.addConsultation(dtc14);
        DateTime dtc15 = new DateTime(tm.getDay(11) ,Timetable.TWOOCLOCK);
        phys4.addConsultation(dtc15);
        DateTime dtc16 = new DateTime(tm.getDay(17) ,Timetable.TWOOCLOCK);
        phys4.addConsultation(dtc16);
        
        
//        
////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        Physician phys5 = new Physician("005", "stella", "26 dorset park", "5476468");
        physicianList.add(phys5); 
        phys5.addExpertise("Physiotherapy");
        DateTime dt57 = new DateTime(tm.getDay(0) ,Timetable.TWOOCLOCK);
        phys5.addAppointmentHours(dt57);
        DateTime dt58 = new DateTime(tm.getDay(2) ,Timetable.TWOOCLOCK);
        phys5.addAppointmentHours(dt58);
        DateTime dt59 = new DateTime(tm.getDay(2) ,Timetable.FOUROCLOCK);
        phys5.addAppointmentHours(dt59);
        DateTime dt60 = new DateTime(tm.getDay(4) ,Timetable.TWOOCLOCK);
        phys5.addAppointmentHours(dt60);
        DateTime dt61 = new DateTime(tm.getDay(4) ,Timetable.FIVEOCLOCK);
        phys5.addAppointmentHours(dt61);
        DateTime dt62 = new DateTime(tm.getDay(4) ,Timetable.ONEOCLOCK);
        phys5.addAppointmentHours(dt62);
        DateTime dt63 = new DateTime(tm.getDay(8) ,Timetable.THREEOCLOCK);
        phys5.addAppointmentHours(dt63);
        DateTime dt64 = new DateTime(tm.getDay(8) ,Timetable.SIXOCLOCK);
        phys5.addAppointmentHours(dt64);
        DateTime dt65 = new DateTime(tm.getDay(9) ,Timetable.SEVENOCLOCK);
        phys5.addAppointmentHours(dt65);
        DateTime dt66 = new DateTime(tm.getDay(9) ,Timetable.ONEOCLOCK);
        phys5.addAppointmentHours(dt66);
        DateTime dt67 = new DateTime(tm.getDay(13) ,Timetable.ONEOCLOCK);
        phys5.addAppointmentHours(dt67);
        DateTime dt68 = new DateTime(tm.getDay(13) ,Timetable.THREEOCLOCK);
        phys5.addAppointmentHours(dt68);
        DateTime dt69 = new DateTime(tm.getDay(15) ,Timetable.THREEOCLOCK);
        phys5.addAppointmentHours(dt69);
        DateTime dt70 = new DateTime(tm.getDay(15) ,Timetable.FOUROCLOCK);
        phys5.addAppointmentHours(dt70);
        DateTime dt71 = new DateTime(tm.getDay(19) ,Timetable.TWOOCLOCK);
        phys5.addAppointmentHours(dt71);

        
        
        
        DateTime dtc17 = new DateTime(tm.getDay(0) ,Timetable.SIXOCLOCK);
        phys2.addConsultation(dtc17);
        DateTime dtc18 = new DateTime(tm.getDay(5) ,Timetable.SIXOCLOCK);
        phys2.addConsultation(dtc18);
        DateTime dtc19 = new DateTime(tm.getDay(11) ,Timetable.SIXOCLOCK);
        phys2.addConsultation(dtc19);
        DateTime dtc20 = new DateTime(tm.getDay(17) ,Timetable.SIXOCLOCK);
        phys2.addConsultation(dtc20);
        
        
        
        
    }
}
