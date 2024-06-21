package main.dates;

import main.users.Doctor;
import main.users.Patiente;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Appointment {

    Scanner sc = new Scanner(System.in);

    private int idPatientAppointment;
    private String date, time;
    private Doctor doctor;
    private Patiente patiente;

    public Appointment() {
    }

    public Appointment(int idPatientAppointment, String date, String time, Doctor doctor, Patiente patiente) {
        this.idPatientAppointment = idPatientAppointment;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patiente = patiente;
    }

    public int getIdPatientAppointment() {
        return idPatientAppointment;
    }

    public void setIdPatientAppointment(int idPatientAppointment) {
        this.idPatientAppointment = idPatientAppointment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patiente getPatiente() {
        return patiente;
    }

    public void setPatiente(Patiente patiente) {
        this.patiente = patiente;
    }

    LinkedHashSet<Object> appointment = new LinkedHashSet<>();

    public void registrerAppointment(){

        //Cita Medica
        System.out.println("Ingresar el ID de la cita medica: " );
        idPatientAppointment = sc.nextInt();
        appointment.add(idPatientAppointment);
        sc.nextLine();
        System.out.println("Ingrese la fecha de la cita: ");
        date = sc.nextLine();
        appointment.add(date);
        System.out.println("Ingrese la hora de la cita: ");
        time = sc.nextLine();
        appointment.add(time);

        //Paciente
        System.out.println("Ingrese el ID del paciente: ");
        int idPatient = patiente.getIdPatiente();
        appointment.add(idPatient);
        System.out.println("Nombre del paciente: ");
        String namePatient = patiente.getName();
        appointment.add(namePatient);
        System.out.println("Apellido del paciente: ");
        String lastNamePatient = patiente.getLastName();
        appointment.add(lastNamePatient);
        System.out.println("Celular del paciente: ");
        String cellphonePatient = patiente.getCellphone();
        appointment.add(cellphonePatient);
        System.out.println("Correo electronico del paciente: ");
        String emailPatient = patiente.getEmail();
        appointment.add(emailPatient);

        //Doctor
        System.out.println("Ingrese el ID del Doctor: ");
        int idDoctor = doctor.getIdDoctor();
        appointment.add(idDoctor);
        System.out.println();
        System.out.println("Nombre del doctor: ");
        String nameDoc = doctor.getNameDoc();
        appointment.add(nameDoc);
        String nameLastDoc = doctor.getLastNameDoc();
        appointment.add(nameLastDoc);
        String specialityDoc = doctor.getSpeacility();
        appointment.add(specialityDoc);
    }

    public void printAppointment(){
        for (Object item: appointment){
            System.out.println(item);
        }
    }
}
