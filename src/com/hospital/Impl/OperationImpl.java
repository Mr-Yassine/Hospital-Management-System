package com.hospital.Impl;

import java.util.*;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.OperationType;
import com.hospital.interfaces.OperationInterface;
import com.hospital.models.*;



public class OperationImpl implements OperationInterface{


    Patient patients = new Patient();
    List<HashMap> myPatients = new ArrayList<>();
    Scanner scan = new Scanner(System.in);






    @Override
    public Optional<Operation> getOperationByRef(int ref) {
        // TODO Auto-generated method stub
        return null;
    }











    @Override
    public void addOperation() {


        double cout = 0;
        double rembourse = 0;
        double operationCost = 0;
        String operationName;
        String operationType;
        String room;
        String insuranceType = "assurance";



        // Create a HashMap object called Doctor
        HashMap patient = new HashMap<>();






        System.out.println("\n============== Operation ===============");
        System.out.println("Choisissez votre operation:\n");
        System.out.println("1- AS312\n" +
                "2- AO932\n" +
                "3- BJ939");
        System.out.println("========================================");

        int operation = scan.nextInt();

        switch(operation) {

            case 1:

                System.out.println("\nLe cout de cette operation " + OperationType.AO932.getCout() + "DH");
                operationName = OperationType.AO932.getOperationName();
                operationType = OperationType.AO932.getOperationType();
                operationCost = OperationType.AO932.getCout();

                if (operationType.equals("urgent")) {
                    System.out.println("\nCette opertaion sera effectue au RC");
                    room = "RD";
                } else {
                    System.out.println("\nCette opertaion sera effectue au 1er etage");
                    room = "1er etage";
                }

                patient.put("Le nom d'operation ",operationName);
                patient.put("Le type d'operation ",operationType);
                patient.put("Le lieu d'operation ",room);
                patient.put("Le cout d'operation ",operationCost);

                break;


            case 2:

                System.out.println("\n\nLe cout de cette operation " + OperationType.AS312.getCout() + "DH");
                operationName = OperationType.AS312.getOperationName();
                operationType = OperationType.AS312.getOperationType();
                operationCost = OperationType.AS312.getCout();

                if (operationType.equals("urgent")) {
                    System.out.println("\nCette opertaion sera effectue au RC");
                    room = "RD";
                } else {
                    System.out.println("\nCette opertaion sera effectue au 1er etage");
                    room = "1er etage";
                }

                patient.put("Le nom d'operation ",operationName);
                patient.put("Le type d'operation ",operationType);
                patient.put("Le lieu d'operation ",room);
                patient.put("Le cout d'operation ",operationCost);



                break;


            case 3:

                System.out.println("\n\nLe cout de cette operation " + OperationType.BJ939.getCout() + "DH");
                operationName = OperationType.BJ939.getOperationName();
                operationType = OperationType.BJ939.getOperationType();
                operationCost = OperationType.BJ939.getCout();

                if (operationType.equals("urgent")) {
                    System.out.println("\nCette opertaion sera effectue au RC");
                    room = "RD";
                } else {
                    System.out.println("\nCette opertaion sera effectue au 1er etage");
                    room = "1er etage";
                }

                patient.put("Le nom d'operation ",operationName);
                patient.put("Le type d'operation ",operationType);
                patient.put("Le lieu d'operation ",room);
                patient.put("Le cout d'operation ",operationCost);


                break;



            default:
                System.out.println("\nOperation not found");
        }










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


                patient.put("Type d'assurance",InsuranceType.CNSS.getValue());
                patient.put("Pourcentage du remboursement ",InsuranceType.CNSS.getRembourse() + "%");
                patient.put("Remboursement ",rembourse + "DH");
                break;


            case 2:

                cout = operationCost * 0.2;
                System.out.println("\nVous devez payez seulement " + cout + "DH");

                insuranceType = InsuranceType.RAMED.getValue();

                patient.put("Type d'assurance",InsuranceType.RAMED.getValue());
                break;


            case 3:

                System.out.println("\nVous devez payez " + operationCost + "DH");

                rembourse = (operationCost * InsuranceType.CNOPS.getRembourse())/100;
                System.out.println("L'assurance va te rembourser avec : " + rembourse + "DH");


                patient.put("Type d'assurance ",InsuranceType.CNOPS.getValue());
                patient.put("Pourcentage du remboursement ",InsuranceType.CNOPS.getRembourse() + "%");
                patient.put("Remboursement ",rembourse + "DH");
                break;

            default:
                System.out.println("operation not found");
        }










        if (insuranceType.equals("RAMED")) {

            if (patients.getWalletBudget() >= cout) {


                System.out.println("\n\n============ Processus administrative =============\n");
                System.out.print("Enter the First Name:");
                scan.nextLine();
                patients.setFirstname(scan.nextLine());

                System.out.print("Enter the Last Name:");
                patients.setLastname(scan.nextLine());

                double rest = patients.getWalletBudget() - cout;
                patients.setWalletBudget(rest);

                patient.put("Prenom ",patients.getFirstname());
                patient.put("Nom ",patients.getLastname());
                patient.put("Wallet ",patients.getWalletBudget());
                myPatients.add(patient);



                System.out.println("\n=================== Resume ======================" );
                int i=1;
                for (Map resume:myPatients){
                    List<Map> list = new ArrayList<>(resume.entrySet());
                    //System.out.println(list);
                    System.out.println("\nPatient n:" +i + "\n");
                    for (Object element:list){
                        System.out.println( element);

                    }
                    i++;
                }
                System.out.println("\n=================================================\n\n" );
                //System.out.println("\n\nVoila un rapport qui resume votre operation \n" + myPatients );



            } else {
                System.out.println("\nVous n'avez pas assez d'argent pour effectuer cette operation");
            }

        } else {

            if (patients.getWalletBudget() >= operationCost) {


                System.out.println("\n\n============ Processus administrative =============\n");
                System.out.print("Enter the First Name:");
                scan.nextLine();
                patients.setFirstname(scan.nextLine());
                System.out.print("Enter the Last Name:");
                patients.setLastname(scan.nextLine());

                double rest = patients.getWalletBudget() - operationCost;
                patients.setWalletBudget(rest);

                patient.put("Prenom ",patients.getFirstname());
                patient.put("Nom ",patients.getLastname());
                patient.put("Wallet ",patients.getWalletBudget());
                myPatients.add(patient);



                System.out.println("\n=================== Resume ======================" );
                int i=1;
                for (Map resume:myPatients){
                    List<Map> list = new ArrayList<>(resume.entrySet());
                    //System.out.println(list);
                    System.out.println("\nPatient n:" +i + "\n");
                    for (Object element:list){
                        System.out.println( element);

                    }
                    i++;
                }
                System.out.println("\n=================================================\n\n" );
               //System.out.println("\n\nVoila un rapport qui resume votre operation \n" + myPatients );



            } else {
                System.out.println("\nVous n'avez pas assez d'argent pour effectuer cette operation");
            }
        }



    }



}
