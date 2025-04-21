package A14.Program;

import A14.Template.AInternare;
import A14.Template.Internare;
import A14.Template.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("ion", "grav");
        AInternare internare = new Internare(pacient1);
        internare.proceduraInternare();
    }
}
