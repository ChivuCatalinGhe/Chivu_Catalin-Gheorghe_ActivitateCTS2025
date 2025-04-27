package A15.Command;

public class ComandaInternare implements IComanda {
    private String nume;
    private String salon;
    private Medic medic;

    public ComandaInternare(String nume, String salon, Medic medic) {
        super();
        this.nume = nume;
        this.salon = salon;
        this.medic = medic;
    }

    @Override
    public void executa() {
        this.medic.Interneaza(nume, salon);
    }
}
