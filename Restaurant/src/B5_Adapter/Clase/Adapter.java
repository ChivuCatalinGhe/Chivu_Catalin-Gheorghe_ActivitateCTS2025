package B5_Adapter.Clase;

public class Adapter extends SoftPrintareBar implements IPrintFactura{
    private String locatie;

    public Adapter(String locatie) {
        this.locatie = locatie;
    }

    @Override
    public void printareFactura(double total) {
        tiparesteBon(total, locatie);
    }
}
