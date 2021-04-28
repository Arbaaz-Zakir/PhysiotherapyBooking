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
public class RoomsList {
    ArrayList<Room> rooms;
    
    public RoomsList(){
        rooms = new ArrayList();
        
        Room medicalSuiteA = new Room("Medical Suite A");
        Room medicalSuiteB = new Room("Medical Suite B");
        Room medicalSuiteC = new Room("Medical Suite C");
        Room medicalSuiteD = new Room("Medical Suite D");
        
        rooms.add(medicalSuiteA);
        rooms.add(medicalSuiteB);
        rooms.add(medicalSuiteC);
        rooms.add(medicalSuiteD);
    }
    
    public void addRoom(Room room){
        rooms.add(room);
    }    
    
//    public String getRooms(){
//        String s = "";
//        for(Room room : rooms){
//            s += room + "\n";
//        }
//        return s;
//    }
    public Room getRoom(int element){
        return rooms.get(element);
        
    }
    
    public int getSize(){
        return rooms.size();
    }
}
