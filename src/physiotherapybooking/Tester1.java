/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
/**
 *
 * @author Arbaaz
 */
public class Tester1 {
    public static void main (String[] args){
//        LocalDateTime booking = LocalDateTime.of(2020, Month.MARCH, 01, 13, 0);
//        System.out.println(booking);
//        
//        LocalDateTime arrive = LocalDateTime.of(2020, Month.MARCH, 01, 13, 29);
//        if(arrive.isAfter(booking) && arrive.isBefore(booking.plusMinutes(30))) {
//            System.out.println("arrived");
//        }
            
        Physician phys1 = new Physician("111", "Arbaaz Zakir", "46 Somerset Avenue", "0102030");
        Physician phys2 = new Physician("222", "bobo marko", "02 downing street", "0456530");
        PhysicianList listOfPhysician = new PhysicianList();
        System.out.println(listOfPhysician.getPhysicianList());
        listOfPhysician.addPhysicianToList(phys1);
        listOfPhysician.addPhysicianToList(phys2);
        System.out.println(listOfPhysician.getPhysicianList());
        
    }
}
