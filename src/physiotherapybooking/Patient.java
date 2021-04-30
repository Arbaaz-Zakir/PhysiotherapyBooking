/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 * Patient class extend Personnel
 * @author Arbaaz
 */
public class Patient extends Personnel{
    
    /**
     * create a new patient
     * @param userID
     * @param fullName
     * @param address
     * @param telephone 
     */
    public Patient(String userID, String fullName, String address, String telephone){
        super(userID, fullName, address, telephone);
    }
}
