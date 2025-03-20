package A3.Fabrici;

import A3.Clase.PersonalSpital;
import A3.Fabrici.TipPersonalSpital;
import A3.Clase.Asistent;
import A3.Clase.Brancardier;
import A3.Clase.Medic;
import A3.Fabrici.TipPersonalMedical;

public class PersonalMedicalFactory implements PersonalSpitalFactory {
    @Override
    public PersonalSpital createPersonalSpital(TipPersonalSpital tipPersonalSpital) {
//        return switch (tipPersonalSpital){
//            case TipPersonalMedical.Asistent -> new Asistent();
//            case TipPersonalMedical.Brancardier -> new Brancardier();
//            case TipPersonalMedical.Medic -> new Medic();
//            default -> null;
//        };
    return null;
    }
}
