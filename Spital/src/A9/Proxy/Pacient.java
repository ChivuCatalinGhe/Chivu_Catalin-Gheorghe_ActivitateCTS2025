package A9.Proxy;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient (String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean getAreAsigurare() {
        return areAsigurare;
    }
}
