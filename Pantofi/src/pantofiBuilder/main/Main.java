package pantofiBuilder.main;

import pantofiBuilder.model.Pantof;
import pantofiBuilder.model.PantofBuilder;
import pantofiBuilder.model.TipPantof;

public class Main {
    public static void main(String[] args) {
        Pantof pantof1 = new PantofBuilder(TipPantof.Balerini,40,1,"piele").build();
        Pantof pantof2 = new PantofBuilder(TipPantof.Stiletto,42,3,"cauciuc")
                .addMaterial("piele")
                .addMaterial("metal")
                .build();

        System.out.println(pantof1.toString());
        System.out.println(pantof2.toString());
    }
}
