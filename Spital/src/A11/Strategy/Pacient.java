package A11.Strategy;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modPlata) {
        super();
        this.nume = nume;
        this.modPlata = modPlata;
    }
    public void plateste(double sumaPlatita) {
        modPlata.plateste(this, sumaPlatita);
    }

    public String getNume() {
        return this.nume;
    }
}
