package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String getBirthday(){
        return this.birthday;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + "Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight(){
        return this.height + "Mts.";
    }

    public void setBlood(String blood){
        this.blood = blood;
    }

    public String getBlood(){
        return this.blood;
    }

    @Override
    public String toString() {
        return super.toString() +"\nAge: " +birthday+ "\nWeight: " +getWeight()+ "\nHeight: " +getHeight()+ "\nBlood: " +blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial de afiliación: Enero/2023 - Actualmente ");
    }
}
