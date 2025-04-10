package A8.Composite;

public class Spital {
    private Structura structura;
    private String denumireSpital;

    public Spital(Structura structura, String denumireSpital) {
        this.structura = structura;
        this.denumireSpital = denumireSpital;
    }

    public String getDenumireSpital() {
        return denumireSpital;
    }

    public void setDenumireSpital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
    }


}
