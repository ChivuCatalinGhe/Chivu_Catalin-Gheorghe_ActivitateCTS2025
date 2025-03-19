package A2.Clase;

public class PersonalMedicalFactory {
    private static PersonalMedicalFactory instanta = null;

    private PersonalMedicalFactory() {}
    public static synchronized PersonalMedicalFactory getInstanta() {
        if (instanta == null) {
            instanta = new PersonalMedicalFactory();
        }
        return instanta;
    }

    public PersonalSpital createPersonalSpital(TipPersonalSpital tipPersonalSpital) throws Exception {
        switch (tipPersonalSpital) {
            case Medic:
                return new Medic();
            case Brancardier:
                return new Brancardier();
            case Asistent:
                return new Asistent();
            default:
                throw new Exception("Tipul nu exista");
        }
    }
}
