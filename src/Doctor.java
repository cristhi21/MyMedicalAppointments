public class Doctor {
    static int id = 0;
    int Showid;
    String name;
    String speciality;

    public Doctor(){
        //System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    public Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("El Id del Doctor es: " + id);
    }
}
