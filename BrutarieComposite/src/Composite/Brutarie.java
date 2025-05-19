package Composite;

public class Brutarie {
    private Structura structura;
    private String denumireBrutarie;
    public Brutarie(Structura structura, String denumireBrutarie) {
        this.structura = structura;
        this.denumireBrutarie = denumireBrutarie;
    }

    public String getDenumireBrutarie() {
        return denumireBrutarie;
    }

    public void setDenumireBrutarie(String denumireBrutarie) {
        this.denumireBrutarie = denumireBrutarie;
    }
}
