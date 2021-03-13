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

}
