package BrutarieStaticBlock;

public class BrutarieStaticBlock {
    private String denumire;
    private String adresa;
    private int CIF;

    private static BrutarieStaticBlock instanta;

    static {
        try {
            instanta = new BrutarieStaticBlock();
        } catch (Exception e) {
            System.out.println("Instanta nu poate fi creata !");
        }
    }

    private BrutarieStaticBlock() {
        this.denumire = "BrutarieStaticBlock";
        this.adresa = "Viorelelor 10";
        this.CIF = 10111122;
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

    public static BrutarieStaticBlock getInstanta(String denumire, String adresa, int CIF) {
        return instanta;
    }
}
