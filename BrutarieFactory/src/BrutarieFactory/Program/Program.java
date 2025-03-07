package BrutarieFactory.Program;

import BrutarieFactory.Clase.BrutarieFactory;
import BrutarieFactory.Clase.CategorieProdus;
import BrutarieFactory.Clase.ProdusPanificatie;

public class Program {

    public static void main(String[] args) {
        BrutarieFactory brutarieFactory = new BrutarieFactory();
        ProdusPanificatie produsPanificatie = null;
        try {
            produsPanificatie = brutarieFactory.creazaProdusPanificatie(CategorieProdus.paineNeagra);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        produsPanificatie.afiseazaDescriere();
    }
}
