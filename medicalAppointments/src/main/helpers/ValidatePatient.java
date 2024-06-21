package main.helpers;

public class ValidatePatient {

    private static final String ID_REGEX = "^\\d+$";
    private static final String NAME_REGEX = "^[a-zA-Z\\s]+$";


    public static boolean validateIdPatient(String idPatent){
        return idPatent.matches(ID_REGEX);
    }
    public static boolean validateName(String name){
        return name.matches(NAME_REGEX);
    }

}
