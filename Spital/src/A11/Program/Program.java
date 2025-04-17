package A11.Program;

import A11.Strategy.Card;
import A11.Strategy.Cash;
import A11.Strategy.Pacient;

public class Program {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Ion Ion", new Card());
        Pacient pacient2 = new Pacient("Gheo Gheo", new Cash());
        pacient1.plateste(100);
        pacient2.plateste(155);

    }
}
