package main.users;

public class TypePatient extends Patiente {

    private String typePatient;
    private int codPatient;

    public TypePatient() {
        super();
    }

    public TypePatient(int idPatient, String name, String lastName, String cellPhone, String email, String typePatient, int codPatient) {
        super(idPatient, name, lastName, cellPhone, email);
        this.typePatient = typePatient;
        this.codPatient = codPatient;
    }

    public String getTypePatient() {
        return typePatient;
    }

    public void setTypePatient(String typePatient) {
        this.typePatient = typePatient;
    }

    public int getCodPatient() {
        return codPatient;
    }

    public void setCodPatient(int codPatient) {
        this.codPatient = codPatient;
    }

    public void createPatient(){
        super.createPatient();
        System.out.println("-------------------------------");
        System.out.println("Seleccione tipo de cliente");
        System.out.println("1. Persona Natural");
        System.out.println("2. Persona Juridica");
        System.out.println("-------------------------------");
        int option = sc.nextInt();
        typePatient = selectTypePatient(option);
        System.out.println("Codigo del pacidente: ");
        codPatient = sc.nextInt();
    }

    public String selectTypePatient(int option){
        if(option == 1){
            String naturalPerson = String.valueOf(TypePatientEnum.NATURAL_PERSON);
            return naturalPerson;
        }
        else if(option == 2){
            String legalPerson = String.valueOf(TypePatientEnum.LEGAL_PERSON);
            return  legalPerson;
        }
        else {
            String message = "Seleccione una opcion valida";
            return message;
        }
    }

    public void updatePatient(){
        super.updatePatient();
    }

    public void selectPatient(){
        super.selectPatient();
        System.out.println("Tipo de paciente: " + typePatient);
        System.out.println("Codigo del paciente: " + codPatient);
    }
    public void selectPatient(String nit, String rut){
        super.selectPatient(nit, rut);
        System.out.println("Tipo de paciente: " + typePatient);
        System.out.println("Codigo del paciente: " + codPatient);
    }

    public void deletePatient(){
        super.deletePatient();
    }
}
