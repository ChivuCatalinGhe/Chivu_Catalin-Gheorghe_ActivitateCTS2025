package B5_Adapter.Clase;

public class SoftPrintareBucatarie implements IPrintFactura {

    @Override
    public void printareFactura(double total) {
        System.out.println("Factura tiparita pentru bucatarie = " + total + " RON");
    }
}
