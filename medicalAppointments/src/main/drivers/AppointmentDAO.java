package main.drivers;

import main.dates.Appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AppointmentDAO {
    public static void createAppointmentDAO(Appointment appointment){
        Connections connection = new Connections();
        try(Connection connection1 = connection.getConnect()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO appointment"
            }
        }
    }
}
