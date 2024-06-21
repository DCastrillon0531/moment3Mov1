package main.test;

import main.drivers.Connections;

import java.sql.Connection;

import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        Connections conexion1 = new Connections();
        try(Connection connection1 = conexion1.getConnect()){

        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
