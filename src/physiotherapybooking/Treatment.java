/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;

/**
 * Treatment a user creates for a booking
 * @author Arbaaz
 */
public class Treatment {
    private String treatmentName;
    private Room room;
    private DateTime appointmentTime;
    private Physician physician;
    private Patient patient;
    
    /**
     * creates a new treatment
     * @param name
     * @param room
     * @param appointmentTime
     * @param physician
     * @param patient 
     */
    public Treatment(String name, Room room, DateTime appointmentTime, Physician physician, Patient patient){
        this.treatmentName = name;
        this.room = room;
        this.appointmentTime = appointmentTime;
        this.physician = physician;
        this.patient = patient;
    }

    /**
     * @return the treatmentName
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * @param treatmentName the treatmentName to set
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * @return the appointmentTime
     */
    public DateTime getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime the appointmentTime to set
     */
    public void setAppointmentTime(DateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * @return the physician
     */
    public Physician getPhysician() {
        return physician;
    }

    /**
     * @param physician the physician to set
     */
    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    /**
     * toString of a Treatment
     * @return  String
     */
    public String toString(){
        String s = "";
        s+= "Physician: " + this.getPhysician().getFullName() + "\n" +
                "Treatment: " + this.getTreatmentName() + "\n" +
                "Patient: " + this.getPatient().getFullName() + "\n" + 
                "Time: " + this.getAppointmentTime() + "\n" + 
                "Room: " + this.getRoom().getRoom();
        return s;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

}
