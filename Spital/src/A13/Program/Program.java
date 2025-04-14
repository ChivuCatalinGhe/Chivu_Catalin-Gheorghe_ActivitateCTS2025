package A13.Program;

import A13.State.Pacient;

public class Program {

    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion Ion");
        pacient1.puneSubObservatie();
        pacient1.puneSubObservatie();
        pacient1.externeaza();
        pacient1.externeaza();
    }
}
