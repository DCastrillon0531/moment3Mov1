package main.drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

    public Connections getConnect(){
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalappointmentdb", "root", "");
            if (connection!=null){
                System.out.println("CONEXION EXITOSA!!!");
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
