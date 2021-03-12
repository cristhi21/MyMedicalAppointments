import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Doctor 1
        Doctor doc = new Doctor("plastico");
        doc.showName();

        //Doctor 2
        Doctor myDoctor = new Doctor();
        myDoctor.name = "cristhian vargas";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        //Doctor 3
        Doctor chapatin = new Doctor();
        chapatin.name = "Roberto Gomez Bolaños";
        chapatin.showName();
        chapatin.showId();
        System.out.println(Doctor.id);

        /*
        * LLamada al method static showMenu que se encuentra en el Package UI en la clase UIMenu
        * Regularmente la sintaxis para un metodo static seria <Class>.<method> pero hemos hecho el import de manera static
        * por tal razon es como si estuviera dentro de nuestro package
        * */
        showMenu();
    }
}

