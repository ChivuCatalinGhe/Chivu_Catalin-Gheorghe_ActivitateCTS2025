package A1.Program;

import A1.Clase.Pacient;
import A1.Clase.PacientBuilder;

public class Program {
    public static void main(String[] args) {
        PacientBuilder builder = new PacientBuilder();
        Pacient pacient = builder.setAreMicDejun(true).setNume("BIBI").setAreHalat(true).build();
        System.out.println(pacient);
    }
}
