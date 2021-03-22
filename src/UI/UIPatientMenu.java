package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Loggout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UI.UIMenu.showMenu();
                    break;

            }
        }while (response != 0);
    }

    private static void showBookAppointmentMenu(){
        int response= 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println();
            System.out.println("Select date: ");
            //Es una colecccion de objetos, por eso necesitamos poner Integer en vez de int
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            //[doctors]
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointment();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++){
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected= new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorAvailableSelected.entrySet()
                 ) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointment().get(indexDate).getDate() +
                    ". Time: " +
                    doctorSelected.getAvailableAppointment().get(indexDate).getTime() );
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());
            if(response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointment().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointment().get(indexDate).getTime()
                );
                showPatientMenu();
            }

        }while(response != 0);
    }

    private static void showPatientMyAppoinments(){
        int response = 0;
        do {
            System.out.println("::My Appoinment");
            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appoinments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i +1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }

            System.out.println("0. Return");
        }while (response != 0);
    }
}
