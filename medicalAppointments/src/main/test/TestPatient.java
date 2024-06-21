package main.test;

import main.users.Patiente;
import main.users.TypePatient;

public class TestPatient {
    public static void main(String[] args) {
        TypePatient typePatient = new TypePatient();
        typePatient.createPatient();
        typePatient.selectPatient();
    }
}
