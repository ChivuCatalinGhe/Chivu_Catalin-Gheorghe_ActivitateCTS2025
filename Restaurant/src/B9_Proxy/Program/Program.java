package B9_Proxy.Program;

import B9_Proxy.Clase.Rezervare;
import B9_Proxy.Clase.RezervareProxy;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare("Ion Ion", 4);
        Rezervare rezervare2 = new Rezervare("Geo Geo", 2);

        rezervare1.rezerva();
        rezervare2.rezerva();

        RezervareProxy proxy1 = new RezervareProxy(rezervare1);
        RezervareProxy proxy2 = new RezervareProxy(rezervare2);

        proxy1.rezerva();
        proxy2.rezerva();
    }
}
