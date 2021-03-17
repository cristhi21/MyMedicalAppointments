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
    public void availableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
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
     * Clase anidada AvailableAppointment - sirve para reservar citas.
     */
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
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
            return "AvailableAppointment \nDate: " + date + ", time='" + time;
        }
    }

}
