import model.*;
import static UI.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        showMenu();
        //abstraccion();
        //citasDisponibles();
        //vistazoMemoria();
        //primerasClases();
    }

    private static void abstraccion(){

        User user = new Doctor("cvargas", "cvargas@gmail.com");
        user.showDataUser();
        System.out.println();

        User userPa = new Patient("zonia", "zvargas@gmail.com");
        userPa.showDataUser();
        System.out.println();

        User userNurse = new Nurse("valen", "tina@gmail.com");
        userNurse.showDataUser();

        /**
         * Clases anonima
         */
        User user1 = new User("cris", "cris@cris.com") {
            @Override
            public void showDataUser() {
                System.out.println();
                System.out.println("Doctor: " + getName() + " Email: " + getEmail());
                System.out.println("Hospital: Nueva EPS");
                System.out.println("Depto: Geriaitria");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
    }

    private static void citasDisponibles(){
        //System.out.println("Citas");
        /*
        Doctor myDoctor = new Doctor("Alejandro", "alejo@colmedica.com");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "5pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        System.out.println(myDoctor);
        */

        /*
        System.out.println(myDoctor.getAvailableAppointment());

        for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()
        ) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
         */
    }

    /**
     * Clase vistazo a la memoria:
     *
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
        System.out.println(paciente.getName());
        System.out.println(pacienteTwo.getName());

        pacienteTwo = paciente;
        System.out.println();
        System.out.println(paciente);
        System.out.println(pacienteTwo);
        System.out.println(paciente.getName());
        System.out.println(pacienteTwo.getName());

        paciente = pacienteTwo;
        paciente.setName("Ruben");
        pacienteTwo.setEmail("antonieta@outlook.com");
        System.out.println();
        System.out.println(paciente);
        System.out.println(pacienteTwo);
        System.out.println(paciente.getName());
        System.out.println(pacienteTwo.getName());
        System.out.println(paciente.getEmail());
        System.out.println(pacienteTwo.getEmail());
    }

    private static void primerasClases(){

        //model.Doctor 1
        /*
        model.Doctor doc = new model.Doctor("plastico");
        doc.showName();

        //model.Doctor 2
        model.Doctor myDoctor = new model.Doctor();
        myDoctor.setName("cristhian vargas");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(model.Doctor.id);

        //model.Doctor 3
        model.Doctor chapatin = new model.Doctor();
        chapatin.setName("Roberto Gomez Bola??os");
        chapatin.showName();
        chapatin.showId();
        System.out.println(model.Doctor.id);
        */
        /*
        * LLamada al method static showMenu que se encuentra en el Package UI en la clase UIMenu
        * Regularmente la sintaxis para un metodo static seria <Class>.<method> pero hemos hecho el import de manera static
        * por tal razon es como si estuviera dentro de nuestro package
        * */
        //showMenu();
    }
}

