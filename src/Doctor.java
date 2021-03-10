public class Doctor {
    int id;
    String name;
    String speciality;

    public Doctor(){
        System.out.println("Construyendo el objeto conductor");
    }

    public Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
