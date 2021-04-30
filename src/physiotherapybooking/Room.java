/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.util.ArrayList;

/**
 * Room is a string
 * @author Arbaaz
 */
public class Room {
    private String room;
    
    /**
     * creates a new room
     * @param room 
     */
    public Room(String room){
        this.room = room;
    }

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
