package UI;

import java.util.Scanner;

public class UIDoctorMenu {
    /**
     * Mostrar logica de opciones para nuestro doctor
     */
    public static void showDoctorMenu(){
        //do while es excelente para menus
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Dr");
            System.out.println("Welcome Dr: " + UIMenu.doctorLogged.getName());

            System.out.println("1. Add available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Loggout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }

        }while(response!=0);
    }

    private void showAddAvailableAppointmentMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");
            for (int i= 0; i <= UIMenu.MONTH.length; i++){
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTH);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <= 12){
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTH[monthSelected]);

                System.out.println("Insert the date available: [dd/MM/yyyy]");
                String date = sc.nextLine();
                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");

            }else if(response == 0){
                //Regresar al menu anterior
                showDoctorMenu();
            }
        }while (response!=0);

    }

}
