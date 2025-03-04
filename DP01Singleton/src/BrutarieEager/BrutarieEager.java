package BrutarieEager;

public class BrutarieEager {
    private String denumire;
    private String adresa;
    private int CIF;

    private static final BrutarieEager instanta = new BrutarieEager();

    private BrutarieEager() {
        this.denumire = "HappyBakery";
        this.adresa = "Strada Verde Nr. 5";
        this.CIF = 123456;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getCIF() {
        return CIF;
    }

    public void setCIF(int CIF) {
        this.CIF = CIF;
    }

    public static BrutarieEager getInstanta(String denumire, String adresa, int CIF) {
        return instanta;
    }
}
