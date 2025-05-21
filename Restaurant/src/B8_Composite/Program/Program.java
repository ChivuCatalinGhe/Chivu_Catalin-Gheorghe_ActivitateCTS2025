package B8_Composite.Program;

import B8_Composite.Clase.IOptiune;
import B8_Composite.Clase.Item;
import B8_Composite.Clase.Sectiune;
import B8_Composite.Clase.Subsectiune;

public class Program {
    public static void main(String[] args) {
        IOptiune sStartere = new Sectiune("Startere");
        IOptiune sBauturi = new Sectiune("Bauturi");
        IOptiune ssAperitive = new Subsectiune("Aperitive");
        IOptiune ssSucuri = new Subsectiune("Sucuri");
        IOptiune iIcre = new Item("Icre");
        IOptiune iApaPlata = new Item("ApaPlata");

        try {
            sStartere.adaugaNod(ssAperitive);
            ssAperitive.adaugaNod(iIcre);
            sBauturi.adaugaNod(ssSucuri);
            ssSucuri.adaugaNod(iApaPlata);

            System.out.println("Meniu:");
            sStartere.descriere();
            sBauturi.descriere();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
