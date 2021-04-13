/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDateTime;
import java.time.Month;
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
    Physician xx = new Physician("222", "bob", "26 dorset park", "5476468");
    
    public BookingController(){
        xx.addExpertise("accupunture");
        
        //LocalDateTime.of(2020, Month.MARCH, 01, 13, 29)
        xx.addConsultationHours(LocalDateTime.of(2020, Month.MARCH, 01, 13, 29));
        
        listOfPhysician.addPhysicianToList(xx);
        listOfUsers.addUserToList(u1);
        
        //boolean sysActive = true;
        System.out.println("Welcome to The Physiotherapy & Sports Injury Centre (PSIC) Booking system");
        String option = "";
        String usersInput = "";
        
        do{
            System.out.println("Are you a user in our system? Y/N");
            option = input.nextLine();
        }
        while(option.isEmpty());
        

        if(option.equalsIgnoreCase("y")){
            do{
                System.out.println("please enter user ID");
                usersInput = input.nextLine();
            }
            while(usersInput.isEmpty());
            if(listOfUsers.userExists(usersInput)){
                sysUser = listOfUsers.getUserByID(usersInput);
                System.out.println("Welcome " + sysUser.getFullName());
                usersInput= "";
                option = "";
                // add here functionality of what one can do when logged in
                do{
                    System.out.println("Would you like to search for a Physician? (Y/N)");
                    option = input.nextLine();
                }
                while(option.isEmpty());
                //option = "";
                if(option.equalsIgnoreCase("y")){
                    do{
                        System.out.println("Enter a physicians name: ");
                        usersInput = input.nextLine();
                    }
                    while(usersInput.isEmpty());
                    
                    if(listOfPhysician.physicianExists(usersInput)){
                        System.out.println(listOfPhysician.getPhysiciansByName(usersInput));
                        do{
                            System.out.println("Would you like to select a appointment? (Y/N)");
                            option = input.nextLine();
                        }
                        while(option.isEmpty());
                        
                        if(option.equalsIgnoreCase("y")){
                            //select time
                            // ask for year month time
                            option = "";
                            do{
                                System.out.println("selct a date");
                                option = input.nextLine();
                            }
                            while(option.isEmpty());
                            int selectedDate = Integer.parseInt(option);
                            //LocalDateTime selected = listOfPhysician.getPhysiciansByName(usersInput).selectTime(option);
                            //Treatment treatment = new Treatment("Treatment name",room, selected,listOfPhysician.getPhysiciansByName(usersInput));
                        }
                    }
                }
            }


//
//            else {
//                System.out.println("User does not exist");
//                }

            }



        
        
//        while(usersInput != "exit"){
//            System.out.println("Are you a user in our system? Y/N");
//        
//            usersInput = input.nextLine();
//
//            if(usersInput.equalsIgnoreCase("y")){
//                    System.out.println("please enter user ID");
//                    usersInput = input.nextLine();
//                    if(listOfUsers.userExists(usersInput)){
//                        sysUser = listOfUsers.getUserByID(usersInput);
//                        System.out.println("Welcome " + sysUser.getFullName());
//                        
//                        // add here functionality of what one can do when logged in
//                        
//                    }
//
//
//
//                    else {
//                        System.out.println("User does not exist");
//                    }
//
//            }
//                else if (usersInput.equalsIgnoreCase("n")){
//                    System.out.println("Would you like to enter as a vistor?");
//                }
//            }
        System.out.println("THANK YOU FOR USING THE SYSTEM");
    }
}
