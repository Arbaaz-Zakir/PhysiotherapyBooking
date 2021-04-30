/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Timetable used 
 * @author Arbaaz
 */
public class Timetable {
    public static final String ONEOCLOCK = "13:00 - 14:00";
    public static final String TWOOCLOCK = "14:00 - 15:00";
    public static final String THREEOCLOCK = "15:00 - 16:00";
    public static final String FOUROCLOCK = "16:00 - 17:00"; 
    public static final String FIVEOCLOCK = "17:00 - 18:00";
    public static final String SIXOCLOCK = "18:00 - 19:00";
    public static final String SEVENOCLOCK = "20:00 - 21:00";
    
    private ArrayList<String> timetable;

    /**
     * creates a new timetable with loaded data of a month
     */
    public Timetable() {
        timetable = new ArrayList();
        timetableData();

    }

    /**
     * adds new day to time table
     * @param day 
     */
    public void addDay(String day) {
        this.timetable.add(day);
    }

    /**
     * returns a day based on index
     * @param day
     * @return 
     */
    public String getDay(int day) {
        return timetable.get(0);

    }

    /**
     * toString of Timetable
     * @return 
     */
    public String toString() {
        String s = "Days: \n";
        for (String days : timetable) {
            int number = 0;
            s += number + " : " + days + "\n";
            number++;
        }
        return s;
    }
    
    /**
     * Timetable data of the month of april to pre load
     */
    private void timetableData() {
        String day1 = "01/04/2021";
        addDay(day1);

        String day2 = "02/04/2021";
        addDay(day2);

        String day3 = "03/04/2021";
        addDay(day3);

        String day4 = "04/04/2021";
        addDay(day4);

        String day5 = "05/04/2021";
        addDay(day5);

        String day6 = "06/04/2021";
        addDay(day6);

        String day7 = "07/04/2021";
        addDay(day7);

        String day8 = "08/04/2021";
        addDay(day8);

        String day9 = "09/04/2021";
        addDay(day9);

        String day10 = "10/04/2021";
        addDay(day10);

        String day11 = "11/04/2021";
        addDay(day11);

        String day12 = "12/04/2021";
        addDay(day12);

        String day13 = "13/04/2021";
        addDay(day13);

        String day14 = "14/04/2021";
        addDay(day14);

        String day15 = "15/04/2021";
        addDay(day15);

        String day16 = "16/04/2021";
        addDay(day16);

        String day17 = "17/04/2021";
        addDay(day17);

        String day18 = "18/04/2021";
        addDay(day18);

        String day19 = "19/04/2021";
        addDay(day19);

        String day20 = "20/04/2021";
        addDay(day20);

        String day21 = "21/04/2021";
        addDay(day21);

        String day22 = "22/04/2021";
        addDay(day22);

        String day23 = "23/04/2021";
        addDay(day23);

        String day24 = "24/04/2021";
        addDay(day24);

        String day25 = "25/04/2021";
        addDay(day25);

        String day26 = "26/04/2021";
        addDay(day26);

        String day27 = "27/04/2021";
        addDay(day27);

        String day28 = "28/04/2021";
        addDay(day28);

        String day29 = "29/04/2021";
        addDay(day29);

        String day30 = "30/04/2021";
        addDay(day30);
    }

}
