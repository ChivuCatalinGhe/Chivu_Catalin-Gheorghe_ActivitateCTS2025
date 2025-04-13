package A9.Proxy;

public class Internare implements IInternare {
    private Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void interneaza() {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
    }
}
