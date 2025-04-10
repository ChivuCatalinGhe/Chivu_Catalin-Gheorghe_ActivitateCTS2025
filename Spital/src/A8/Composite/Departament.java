package A8.Composite;

public class Departament extends ANod{
    String denumire;

    public Departament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
