package com.hospital.models;

import javax.print.Doc;

public class Operation {


    private Hospital hospital;
    private Room room;
    private Doctor doctor;
    private Nurse nurse;
    private Patient patient;



    public Operation(){};

    public Operation(Hospital hospital, Room room, Doctor doctor, Nurse nurse, Patient patient) {
        this.hospital = hospital;
        this.room = room;
        this.doctor = doctor;
        this.nurse = nurse;
        this.patient = patient;
    }



    public Hospital getHospital() {
        return hospital;
    }
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }




    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }




    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }





    public Nurse getNurse() {
        return nurse;
    }
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }





    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }


// Une opération sera dans un hopital, dans une salle spécifique, et géré par un médecin X qui fait partie de l'hopital :)
	
	// Il faut vérifier l'assurance du patient avant de passer l'opération
	
	// Ajouter une classe infirmière pour aider le médecin dans son travail
	
	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED et 100% pour CNOPS 
	
	// chaque opération a un prix, le patient doit payer le montant et après l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient va juste 
	// payer la différence dès le début (20%)
	
	// Proposition : Ajouter un attribut portefeuille à la classe Patient pour gérer le solde du patient, et du coup il faut avoir aussi une classe transaction qui traçe les 
	// actions de payments avec la date...
	
	// Essayer de structurer votre travail avec la création des interfaces qui vous permettez d'implémenter les méthodes nécessaires.
	
	// Après le payement d'une opération et si c'est passé avec succès le programme est terminé, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal. (vous devez gérer les status de chaque opération)
}