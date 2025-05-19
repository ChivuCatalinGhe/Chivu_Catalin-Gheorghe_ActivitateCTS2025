package Composite;

public class PunctLucru extends ANod{
    private String denumire;
    public PunctLucru(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
