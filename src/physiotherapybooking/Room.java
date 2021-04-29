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
public class Room {
    private String room;
    //private boolean availability;
    
    public Room(String room){
        this.room = room;
    }

    /**
     * @return the availability
     */
//    public boolean isAvailable() {
//        return availability;
//    }

    /**
     * @param isAvailable the availability to set
     */
//    public void setIsAvailable(boolean isAvailable) {
//        this.availability = isAvailable;
//    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
    
    
    
}
