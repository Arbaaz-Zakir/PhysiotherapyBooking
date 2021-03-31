package physiotherapybooking;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arbaaz
 */
public class PhysicianCollection {
    
    private ArrayList <Physician> PhysicianList;
    
    /**
     * 
     */
    public PhysicianCollection(){
        PhysicianList = new ArrayList<Physician>();
    }
    
    /**
     * 
     * @param newPhysician 
     */
    public void addPhysician(Physician newPhysician){
        PhysicianList.add(newPhysician);
    }
    
    /**
     * 
     * @return 
     */
    public String listPhysician(){
        String listOfPhysicians = "";
        for(Physician physician : PhysicianList){
            listOfPhysicians += physician + "\n";
        }
        
        return listOfPhysicians;
    }
    
    
}
