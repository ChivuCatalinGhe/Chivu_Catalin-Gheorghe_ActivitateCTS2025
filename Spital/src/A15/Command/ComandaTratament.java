package A15.Command;

public class ComandaTratament implements IComanda {
    private String nume;
    private Medic medic;

    public ComandaTratament(String nume, Medic medic) {
        super();
        this.nume = nume;
        this.medic = medic;
    }

    @Override
    public void executa() {
        this.medic.TrateazaImediat(nume);
    }
}
