package A6.Program;

import A6.Facade.InternareFacade;
import A6.Facade.Medic;
import A6.Facade.Pacient;
import A6.Facade.Salon;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion Ion",false);
        Pacient pacient2 = new Pacient("Gheo Gheo",true);
        Medic medic1 = new Medic("Gogu Gogo");
        Salon salon1 = new Salon(3);
        System.out.println(InternareFacade.verificareInternare(pacient1,medic1,salon1));
        System.out.println(InternareFacade.verificareInternare(pacient2,medic1,salon1));
        salon1.ocupaPat();
        salon1.ocupaPat();
        salon1.ocupaPat();
        System.out.println(InternareFacade.verificareInternare(pacient2,medic1,salon1));

    }
}
