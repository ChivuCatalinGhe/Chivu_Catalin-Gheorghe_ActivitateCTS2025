package A3.Fabrici;

import A3.Clase.PersonalSpital;
import A3.Clase.Registrator;
import A3.Clase.Secretar;

public class PersonalNonmedicalFactory implements PersonalSpitalFactory {
    @Override
    public PersonalSpital createPersonalSpital(TipPersonalSpital tipPersonalSpital) {
//        return switch (tipPersonalSpital){
//            case TipPersonalNonmedical.Registrator -> new Registrator();
//            case TipPersonalNonmedical.Secretar -> new Secretar();
//            default -> null;
//        };
        return null;
    }
}
