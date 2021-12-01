package com.hospital.app;
import java.util.*;
import com.hospital.models.*;




public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Doctor myDoctors = new Doctor();
        Nurse myNurses = new Nurse();
        Patient myPatients = new Patient();


        int choix = 9;



        do {

            System.out.print("Choisissez votre opertion:\n");
            System.out.print("1- Ajouter Docteur\n" +
                    "2- Ajouter Infermiere\n" +
                    "3- Ajouter Patient\n" +
                    "4- Voir nos docteurs\n" +
                    "5- Voir nor infermieres\n" +
                    "0- Exit\n");



            choix = scan.nextInt();
            scan.nextLine();
            switch(choix) {
                case 1:

                    myDoctors.addDoctor();
                    break;


                case 2:

                    myNurses.addNurse();
                    break;


                case 3:

                    myPatients.addPatient();
                    break;




                default:
                    System.out.println("Operation not found");

            }


        } while (choix != 0);





    }
}
