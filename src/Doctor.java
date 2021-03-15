import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //Autoincrement
    int Showid;
    String name;
    String speciality;

    public Doctor(){
        //System.out.println("Construyendo el objeto Doctor");
    }

    public Doctor(String name, String speciality){
        id++;
        // this hace referencia a todos los elementos que componen la clase
        this.name = name;
        this.speciality = speciality;
    }

    public Doctor(String name) {
        System.out.println("Constructor de un solo parametro");
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("El Id del Doctor es: " + id);
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
    }

}
