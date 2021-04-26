/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapybooking;
import java.time.LocalDateTime;
/**
 *
 * @author Arbaaz
 */
public class Treatment {
    private String treatmentName;
    private Room room;
    private LocalDateTime appointmentTime;
    private Physician physician;
    private Patient patient;
    
    public Treatment(String name, Room room, LocalDateTime appointmentTime, Physician physician, Patient patient){
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
    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime the appointmentTime to set
     */
    public void setAppointmentTime(LocalDateTime appointmentTime) {
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
