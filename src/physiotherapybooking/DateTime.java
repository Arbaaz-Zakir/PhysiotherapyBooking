/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 *
 * @author Arbaaz
 */
public class DateTime {
    private String date;
    private String time;
    
    public DateTime(String date, String time){
        this.date = date;
        this.time = time;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
    public String toString(){
        String s = "";
        s+= "Date: " + getDate() + " || " + "Time: " + getTime();
        return s;
    }
}
