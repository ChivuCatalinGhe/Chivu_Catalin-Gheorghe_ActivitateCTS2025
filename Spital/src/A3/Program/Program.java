package A3.Program;

import A3.Clase.PersonalSpital;
import A3.Fabrici.*;

public class Program {
    public static void main(String[] args) {
        PersonalSpitalFactory fabricaPersonalMedical = new PersonalMedicalFactory();
        PersonalNonmedicalFactory fabricaPersonalNonmedical = new PersonalNonmedicalFactory();

        PersonalSpital personalSpital = fabricaPersonalMedical.createPersonalSpital(TipPersonalMedical.Brancardier);
        personalSpital.AfisareDescriere();
        personalSpital= fabricaPersonalNonmedical.createPersonalSpital(TipPersonalNonmedical.Secretar);
        personalSpital.AfisareDescriere();
    }
}
