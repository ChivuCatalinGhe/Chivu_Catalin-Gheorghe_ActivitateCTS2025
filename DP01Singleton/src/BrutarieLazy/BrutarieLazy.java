package BrutarieLazy;

public class BrutarieLazy {
    private String denumire;
    private String adresa;
    private int CIF;

    private static BrutarieLazy instanta = null;

    private BrutarieLazy(String denumire, String adresa, int CIF) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.CIF = CIF;
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

    public static BrutarieLazy getInstanta(String denumire, String adresa, int CIF) {
        if (instanta == null) {
            instanta = new BrutarieLazy(denumire, adresa, CIF);
        }
        return instanta;
    }
}
