package main.helpers;

public class ValidateDoctor {
    private static final String ID_REGEX = "^\\d+$";
    private static final String NAME_REGEX = "^[a-zA-Z\\s]+$";


    public static boolean validateIdDoctor(String idDoctor){
        return idDoctor.matches(ID_REGEX);
    }

    public static boolean validateNameDoctor(String nameDoc){
        return nameDoc.matches(NAME_REGEX);
    }
}
