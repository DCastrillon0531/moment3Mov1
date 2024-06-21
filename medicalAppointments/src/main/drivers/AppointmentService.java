package main.drivers;

import main.dates.Appointment;

import java.util.Scanner;

public class AppointmentService {

    Scanner sc = new Scanner(System.in);

    public void createAppointment(Appointment appointment){
        System.out.println("ID Cita Medica: ");
        int idPatientAppointment = sc.nextInt();
        sc.nextLine();
        appointment.setIdPatientAppointment(idPatientAppointment);
        System.out.println("");
    }
}
