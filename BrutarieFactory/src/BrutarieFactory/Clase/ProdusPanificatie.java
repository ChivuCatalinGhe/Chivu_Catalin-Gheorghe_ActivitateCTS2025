package BrutarieFactory.Clase;

public abstract class ProdusPanificatie {

    private String denumire;
    private Float gramaj;
    private Float pret;

    public ProdusPanificatie(String denumire, Float gramaj, Float pret) {
        this.denumire = denumire;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Float getGramaj() {
        return gramaj;
    }

    public void setGramaj(Float gramaj) {
        this.gramaj = gramaj;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public abstract void afiseazaDescriere();
}
