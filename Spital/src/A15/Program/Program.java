package A15.Program;

import A15.Command.*;

public class Program {
    public static void main(String[] args) {

        String pacient1 = "Ion Ion";
        String pacient2 = "Gheo Gheo";
        Medic medic1 = new Medic("Popescu");

        IComanda c1 = new ComandaTratament(pacient1, medic1);
        IComanda c2 = new ComandaInternare(pacient2,"101C",medic1);

        Operator operator = new Operator();
        operator.preiaComanda(c1);
        operator.preiaComanda(c2);
        operator.transmiteComenzile();
    }
}
