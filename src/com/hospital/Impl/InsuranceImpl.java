package com.hospital.Impl;


import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.InsuranceInterface;
import com.hospital.models.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InsuranceImpl implements InsuranceInterface {



    double cout = 0;
    double rembourse = 0;
    double operationCost = 0;
    String insuranceType = "assurance";





    Operation operations = new Operation();
    List<HashMap> myPatients = new ArrayList<>();
    Scanner scan = new Scanner(System.in);



    public void assurance() {


        // Create a HashMap object called Doctor
        HashMap ourPatient = new HashMap<>();


        System.out.println("\n============== Assurance ===============");
        System.out.println("Choisissez votre type d'assurance:\n");
        System.out.print("1- CNSS\n" +
                "2- RAMED\n" +
                "3- CNOPS");
        System.out.println("\n========================================");

        int choix = scan.nextInt();

        switch(choix) {
            case 1:

                System.out.println("\nVous devez payez " + operationCost + "DH");


                rembourse = (operationCost * InsuranceType.CNSS.getRembourse())/100;
                System.out.println("L'assurance va te rembourser avec : " + rembourse + "DH");


                ourPatient.put("Type d'assurance",InsuranceType.CNSS.getValue());
                ourPatient.put("Pourcentage du remboursement ",InsuranceType.CNSS.getRembourse() + "%");
                ourPatient.put("Remboursement ",rembourse + "DH");
                break;


            case 2:

                cout = (operationCost * 20)/100;
                System.out.println("\nVous devez payez seulement " + cout + "DH");

                insuranceType = InsuranceType.RAMED.getValue();

                ourPatient.put("Type d'assurance",InsuranceType.RAMED.getValue());
                break;


            case 3:

                System.out.println("\nVous devez payez " + operationCost + "DH");

                rembourse = (operationCost * InsuranceType.CNOPS.getRembourse())/100;
                System.out.println("L'assurance va te rembourser avec : " + rembourse + "DH");


                ourPatient.put("Type d'assurance ",InsuranceType.CNOPS.getValue());
                ourPatient.put("Pourcentage du remboursement ",InsuranceType.CNOPS.getRembourse() + "%");
                ourPatient.put("Remboursement ",rembourse + "DH");
                break;

            default:
                System.out.println("operation not found");
        }

    }
}
