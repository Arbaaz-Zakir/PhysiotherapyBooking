/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 * DataTime object dealing with date time
 *
 * @author Arbaaz
 */
public class DateTime {

    private String date;
    private String time;
    private boolean available;

    /**
     * creates a new DateTime object store a date and time as a string
     *
     * @param date
     * @param time
     */
    public DateTime(String date, String time) {
        this.date = date;
        this.time = time;
        this.available = true;
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

    /**
     * toString method for DateTime
     *
     * @return
     */
    public String toString() {
        String s = "";
        s += "Date: " + getDate() + " || " + "Time: " + getTime();
        return s;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
