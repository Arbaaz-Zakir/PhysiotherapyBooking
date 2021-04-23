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
public class RoomsCollection {
    ArrayList<String> rooms;
    
    public RoomsCollection(){
        rooms = new ArrayList();
    }
    
    public void addRoom(String room){
        rooms.add(room);
    }    
    
    public String getRooms(){
        String s = "";
        for(String room : rooms){
            s += room + "\n";
        }
        return s;
    }
}
