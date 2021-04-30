/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;

/**
 * Collection of rooms
 * @author Arbaaz
 */
public class RoomsList {
    ArrayList<Room> rooms;
    
    /**
     * creates a new room with pre-loaded date
     */
    public RoomsList(){
        rooms = new ArrayList();
        loadData(); 
    }
    
    /**
     * add a new room
     * @param room 
     */
    public void addRoom(Room room){
        rooms.add(room);
    }    
    
    /**
     * returns room based on index
     * @param element
     * @return Room
     */
    public Room getRoom(int element){
        return rooms.get(element);
        
    }
    
    /**
     * return collection of Rooms
     * @return ArrayList
     */
    public ArrayList getRoomList(){
        return rooms;
    }
    
    /**
     * returns size of the collection
     * @return int
     */
    public int getSize(){
        return rooms.size();
    }
    
    
    
    /**
     * loads Room data in list
     */
    public void loadData(){
        Room medicalSuiteA = new Room("Medical Suite A");
        Room medicalSuiteB = new Room("Medical Suite B");
        Room medicalSuiteC = new Room("Medical Suite C");
        Room medicalSuiteD = new Room("Medical Suite D");
        
        rooms.add(medicalSuiteA);
        rooms.add(medicalSuiteB);
        rooms.add(medicalSuiteC);
        rooms.add(medicalSuiteD);
    }
}
