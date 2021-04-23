/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;

/**
 *
 * @author Arbaaz
 */
public class UserList {
    private ArrayList<User> userList;
    
    public UserList(){
        userList = new ArrayList(); 
    }
    
    public User getUserByID(String userID){
        String s = "";
        for(User user : userList){
            if (user.getUserID().equals(userID)){
                return user;
            }
        }
        return null;
    }
    
    public String getUserByName(String userName){
        String s = "";
        for(User users : userList){
            if (users.getFullName().equals(userName)){
                s += users.getUserID()+ "  " + users.getFullName() + "\n";
            }
        }
        return s;
    }
    
    public boolean userExists(String userID){
        for(User users : userList){
            if(users.getUserID().equals(userID)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList getUserList(){
        return userList;
    }
    
    public void addUserToList(User user){
        userList.add(user);
    }
}
