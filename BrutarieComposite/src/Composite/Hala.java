package Composite;

public class Hala extends ANod{
    private String denumire;
    public Hala(String denumire) {
        this.denumire = denumire;
    }
    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
