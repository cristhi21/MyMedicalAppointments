import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String address;
    private String phoneNumber;
    private String speciality;

    //Comportamientos
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
