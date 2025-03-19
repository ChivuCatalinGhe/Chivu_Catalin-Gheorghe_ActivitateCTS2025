package A2.Program;

import A2.Clase.PersonalMedicalFactory;
import A2.Clase.PersonalSpital;
import A2.Clase.TipPersonalSpital;

public class Program {
    public static void main(String[] args) {
        PersonalMedicalFactory personalMedicalFactory = PersonalMedicalFactory.getInstanta();
        PersonalSpital personalSpital = null;
        try{
            personalSpital = personalMedicalFactory.createPersonalSpital(TipPersonalSpital.Medic);
        } catch (Exception e) {
            e.printStackTrace();
        }
        personalSpital.descriere();
    }
}
