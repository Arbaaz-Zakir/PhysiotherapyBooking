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
    ArrayList<String> rooms;
    
    public Room(){
        rooms = new ArrayList();
    }
    
    public void addRoom(String room){
        rooms.add(room);
    }
    
    
}
