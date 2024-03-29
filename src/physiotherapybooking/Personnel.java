package physiotherapybooking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * parent class for users of the system stores personell details
 * @author Arbaaz
 */
public class Personnel {
    private String userID; // need to make it self increment whenever new user to keep unique
    private String fullName;
    private String address;
    private String telephone;
    
    /**
     * creates a new Personnel
     * @param userID
     * @param fullName
     * @param address
     * @param telephone 
     */
    public Personnel(String userID, String fullName, String address, String telephone){
        this.userID = userID;
        this.fullName = fullName;
        this.address = address;
        this.telephone = telephone;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * toString of Personnel
     * @return String
     */
    public String toString(){
        return userID + " " + fullName + " " + address + " " + telephone; 
    }
    
}
