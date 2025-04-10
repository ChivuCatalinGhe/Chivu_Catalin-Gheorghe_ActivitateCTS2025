package A8.Composite;

public class Sectie extends ANod{
    String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
