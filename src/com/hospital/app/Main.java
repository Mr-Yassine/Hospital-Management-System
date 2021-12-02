package com.hospital.app;
import java.util.*;

import com.hospital.Impl.DoctorImpl;
import com.hospital.Impl.NurseImpl;
import com.hospital.Impl.OperationImpl;
import com.hospital.models.*;




public class Main {


    static DoctorImpl docImpl = new DoctorImpl();
    static NurseImpl infImpl = new NurseImpl();
    static OperationImpl operImpl = new OperationImpl();



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Nurse myNurses = new Nurse();
        Patient myPatients = new Patient();
        Operation myOperation = new Operation();


        int choix = 9;



        do {

            System.out.println("\n================= Menu =================");
            System.out.println("Choisissez votre opertion:\n");
            System.out.println("1- Ajouter Docteur\n" +
                    "2- Ajouter Infermiere\n" +
                    "3- Ajouter Patient\n" +
                    "4- Voir nos docteurs\n" +
                    "5- Voir nos infermieres\n" +
                    "0- Exit");
            System.out.println("========================================\n");



            choix = scan.nextInt();
            scan.nextLine();
            switch(choix) {
                case 1:

                    docImpl.addDoctor();
                    break;


                case 2:

                    infImpl.addNurse();
                    break;


                case 3:

                    operImpl.addOperation();
                    break;



                case 4:

                    docImpl.showDoctor();
                    break;



                case 5:

                    infImpl.showNurse();
                    break;



                case 0:

                    System.out.println("Merci pour votre confiance, au revoir!!");
                    break;


                default:
                    System.out.println("Operation not found");

            }


        } while (choix != 0);





    }
}
