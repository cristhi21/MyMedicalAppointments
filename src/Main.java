import java.lang.reflect.Parameter;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Doctor 1
        /*Doctor doc = new Doctor("plastico");
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
        //showMenu();

        //Clase vistazo a la memoria:
        vistazoMemoria();

    }

    /**
     * Este metodo nos sirve para visualizar lo que pasa en memoria con una variable vs un objeto
     * Cuando se crean variables y objetos se asigna un espacio en memoria
     * existen 2 tipos de memoria la stack y la heap
     * en la stack se guardan las varibles primitivas
     * los objetos tambien se guardan en la memoria stack pero a modo de coordenada, de informacion
     * para consultar la verdadera informacion de un objeto de un objeto hay que ir a la memoria heap
     * es alli donde tiene su verdaero contenido o informacion.
     *
     * Nota: observar como cambian los valores de un objeto en comparacion con los de una variable
     * usted notara que cuando asignamos a una variable el valor de otra variable y luego lo cambiamos
     * con otro valor cada una se conserva el valor que esperamos.
     *
     * Pero si creo 2 objetos del mismo tipo y luego a uno asigno el valor del otro objeto
     * la coordenada que tengo en la memoria stack y que apunta a la memora heap cambia
     * al valor que tiene el objeto al que estoy asignando, por tal razon si cambio un valor en cualquiera
     * de los 2 objetos, ese cambio se vera reflejado en ambos objetos porque estoy cambiando la informacion
     * que se encuentra en heap y ambos objetos estan apuntando hacia el mismo sitio.
     */
    private static void vistazoMemoria() {
        int i = 0;
        int a = 2;
        System.out.println(i + " " + a);
        a = i;
        System.out.println(i + " " + a);
        //Reasignacion
        a = 4;
        i = 5;
        System.out.println(i + " " + a);
        System.out.println();
        System.out.println();

        Patient paciente = new Patient("Gonzalo", "gonza@gallo.com");
        Patient pacienteTwo = new Patient("Maria", "maria@gmail.com");

        System.out.println(paciente);
        System.out.println(pacienteTwo);
        System.out.println(paciente.name);
        System.out.println(pacienteTwo.name);

        pacienteTwo = paciente;
        System.out.println();
        System.out.println(paciente);
        System.out.println(pacienteTwo);
        System.out.println(paciente.name);
        System.out.println(pacienteTwo.name);

        paciente = pacienteTwo;
        paciente.name = "Ruben";
        pacienteTwo.email = "antonieta@outlook.com";
        System.out.println();
        System.out.println(paciente);
        System.out.println(pacienteTwo);
        System.out.println(paciente.name);
        System.out.println(pacienteTwo.name);
        System.out.println(paciente.email);
        System.out.println(pacienteTwo.email);
    }
}

