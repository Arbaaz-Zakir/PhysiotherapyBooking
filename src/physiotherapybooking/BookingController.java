/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.Scanner;

/**
 *
 * @author Arbaaz
 */
public class BookingController {
    private Scanner input = new Scanner(System.in);
    private User sysUser;
    
    private PhysicianList listOfPhysician = new PhysicianList();
    private UserList listOfUsers = new UserList();
    
    User u1 = new User("111", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");

    public BookingController(){
        
        listOfUsers.addUserToList(u1);
        boolean sysActive = true;
        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");
        System.out.println("Are you a user in our system? Y/N");
        
        String usersInput = input.nextLine();
        if(usersInput.equalsIgnoreCase("y")){
            System.out.println("please enter user ID");
            usersInput = input.nextLine();
            if(listOfUsers.userExists(usersInput)){
                sysUser = listOfUsers.getUserByID(usersInput);
                System.out.println("Welcome " + sysUser.getFullName());
            }
            else {
                System.out.println("User does not exist");
            }
        }
        else if (usersInput.equalsIgnoreCase("n")){
            System.out.println("Would you like to enter as a vistor?");
        }
        while(sysActive){

        }
    }
}
