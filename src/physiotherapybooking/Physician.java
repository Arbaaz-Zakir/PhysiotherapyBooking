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
public class Physician extends User{
    
    private ArrayList <String> expertise;
    
    public Physician(String fullName, String address, String telephone){
        super(fullName, address, telephone);
        
        this.expertise = new ArrayList<String>();
    }
    
    public void addExpertise(String expertise){
        this.expertise.add(expertise);
    }
    
    public String getExpertise(){
        String s = "";
        for(String physicianExpertise : expertise){
            s += physicianExpertise + "\n";
        }
        
        return s;
    }
}
