package main.users;

import main.helpers.ValidateDoctor;

import java.util.Scanner;

public class Doctor {

    Scanner sc = new Scanner(System.in);

    private int idDoctor;
    private String nameDoc, lastNameDoc, speacility;

    public Doctor() {
    }

    public Doctor(int idDoctor, String nameDoc, String lastNameDoc, String speacility) {
        this.idDoctor = idDoctor;
        this.nameDoc = nameDoc;
        this.lastNameDoc = lastNameDoc;
        this.speacility = speacility;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getLastNameDoc() {
        return lastNameDoc;
    }

    public void setLastNameDoc(String lastNameDoc) {
        this.lastNameDoc = lastNameDoc;
    }

    public String getSpeacility() {
        return speacility;
    }

    public void setSpeacility(String speacility) {
        this.speacility = speacility;
    }

    public void createDoctor(){
        System.out.println("Digite el ID del Doctor: ");
        String idDoctorStr = sc.nextLine();
        if(ValidateDoctor.validateIdDoctor(idDoctorStr)){
            int idDoctor = Integer.parseInt(idDoctorStr);
            this.idDoctor = idDoctor;
        }
        else {
            System.out.println("¡¡¡El ID del doctor debe contener caracteres alfanumericos!!!");
        }
        System.out.println("Digite el nombre del Doctor: ");
        String nameDoc = sc.nextLine();
        if(ValidateDoctor.validateNameDoctor(nameDoc)){
            this.nameDoc = nameDoc;
        }
        else {
            System.out.println("¡¡¡El nombre del doctor no cumple con las condiciones!!!");
        }
        System.out.println("Digite el apellido del Doctor: ");
        lastNameDoc = sc.nextLine();
        System.out.println("Digite la especialidad del Doctor: ");
        speacility = sc.nextLine();

    }

    public void selectDoctor(){
        System.out.println("ID del Doctor: " + idDoctor);
        System.out.println("Nombre del doctor: " + nameDoc);
        System.out.println("Apellido del doctor: " + lastNameDoc );
        System.out.println("Especialidad: " + speacility);
    }
}
