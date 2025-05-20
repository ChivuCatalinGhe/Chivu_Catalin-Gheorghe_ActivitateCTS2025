package B5_Adapter.Program;

import B5_Adapter.Clase.Adapter;
import B5_Adapter.Clase.IPrintFactura;

public class Program {
    public static void main(String[] args) {
        IPrintFactura printare = new Adapter("Bar principal");
        printare.printareFactura(67.50);
    }
}
