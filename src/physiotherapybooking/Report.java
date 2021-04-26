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
public class Report {
    private ArrayList <Booking> report1;
    //private ArrayList <Booking> report2;
    
    public Report(){
        report1 = new ArrayList();
        //report2 = new ArrayList();
    }
    
    public void addReport1(Booking booking){
        this.report1.add(booking);
    }
    
    
    
//    public void addReport2(Booking booking){
//        this.report2.add(booking);
//    }
    
    public String printReport1(){
        String report = "";
        for(Booking book : report1){
            report += border2() + "\n" +
            book.getTreatment().toString() + "\n" +
            border2();
        }
        return report;
    }
    
    public String printReport2(){
        String report = "";
        for(Booking book : report1){
            report += border2() + "\n" +
            book.toString() + "\n" +
            border2();
        }
        return report;
    }
    
    private void border(){
        System.out.println("\n===================================\n");
    }
    
    private String border2(){
        return"===================================";
    }
}
