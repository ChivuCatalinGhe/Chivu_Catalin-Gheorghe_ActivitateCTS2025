package A14.Template;

public abstract class AInternare {

    protected Pacient pacient;

    public AInternare(Pacient pacient) {
        super();
        this.pacient = pacient;
    }

    abstract void analizeazaStarePacient();
    abstract void verificaDisponibilitateSalon();
    abstract void emiteFisaInternare();

    public final void proceduraInternare() {
        analizeazaStarePacient();
        verificaDisponibilitateSalon();
        emiteFisaInternare();
    }
}
