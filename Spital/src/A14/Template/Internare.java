package A14.Template;

public class Internare extends AInternare{
    public Internare(Pacient pacient) {
        super(pacient);
    }

    @Override
    void analizeazaStarePacient() {
        System.out.println("Pacientul " + this.pacient.getNume() + " este in stare " + this.pacient.getStare());
    }

    @Override
    void verificaDisponibilitateSalon() {
        System.out.println("Salon disponibil gasit");
    }

    @Override
    void emiteFisaInternare() {
        System.out.println("Fisa internare emisa pentru pacientul " + this.pacient.getNume());
    }
}
