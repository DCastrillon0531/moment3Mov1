package main.users;

import main.helpers.ValidatePatient;

import java.util.Scanner;

public abstract class Patiente implements UtilPatient {
        Scanner sc = new Scanner(System.in);

        private int idPatiente;
        private String name, lastName, cellphone, email;

    public Patiente() {
    }

    public Patiente(int idPatiente, String name, String lastName, String cellphone, String email) {
        this.idPatiente = idPatiente;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
    }

    public int getIdPatiente() {
        return idPatiente;
    }

    public void setIdPatiente(int idPatiente) {
        this.idPatiente = idPatiente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createPatient(){
        System.out.println("Digite el ID del Paciente: ");
        String idPatientStr = sc.nextLine();
        if(ValidatePatient.validateIdPatient(idPatientStr)){
            int idPatient = Integer.parseInt(idPatientStr);
            this.idPatiente = idPatient;
        }
        else {
            System.out.println("¡¡¡El ID del paciente debe contener valores alfanumericos!!!");
        }
        System.out.println("Digite el nombre del paciente: ");
        String name = sc.nextLine();
        if(ValidatePatient.validateName(name)){
            this.name = name;
        }
        else{
            System.out.println("¡¡¡El nombre no cumple con las condiciones!!!");
        }
        System.out.println("Digite el apellido: ");
        lastName = sc.nextLine();
        System.out.println("Digite el celular: ");
        cellphone = sc.nextLine();
        System.out.println("Digite el correo electronico: ");
        email = sc.nextLine();
    }
    public void updatePatient(){

    }
    public void selectPatient(){
        System.out.println("ID Paciente: " + idPatiente);
        System.out.println("Nombre del Paciente: " + name);
        System.out.println("Apellido del Paciente: " + lastName);
        System.out.println("Celular: " + cellphone);
        System.out.println("Correo: " + email);

    }

    public void selectPatient(String nit, String rut){
        System.out.println("ID Paciente: " + idPatiente);
        System.out.println("NIT: " + nit);
        System.out.println("RUT: " + rut);
        System.out.println("Nombre del Paciente: " + name);
        System.out.println("Apellido del Paciente: " + lastName);
        System.out.println("Celular: " + cellphone);
        System.out.println("Correo: " + email);
    }

    public void deletePatient(){

    }
}
