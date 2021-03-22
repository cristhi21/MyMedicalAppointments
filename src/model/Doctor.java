package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos
    private String speciality;

    //Comportamientos

    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Collection
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    /**
     * Method que añade citas
     * @param date
     * @param time
     */
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        //Caso util de la herencia
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    /**
     * Este metodo es abstracto y es de implementacion obligatoria
     */
    @Override
    public void showDataUser() {
        System.out.println("Doctor del Hospital: Cruz Roja");
        System.out.println("Depto: cancerologia");
    }

    /**
     * Clase anidada AvailableAppointment - sirve para reservar citas.
     */
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment \nDate: " + date + ",\ntime='" + time;
        }
    }

}
