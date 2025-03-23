package pantofiBuilder.model;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements IPantofBuilder {
    private Pantof pantof;
    private TipPantof tipPantof;
    private int numarPantof;
    private int dimensiuneToc;
    private String material;
    private List<String> listaMateriale = null;
    private List<String> listaMesajeText = null;

    public PantofBuilder(TipPantof tipPantof, int numarPantof, int dimensiuneToc, String material) {
        super();
        this.tipPantof = tipPantof;
        this.numarPantof = numarPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
    }

    public PantofBuilder addMaterial(String material) {
        if (this.listaMateriale == null) {
            this.listaMateriale = new ArrayList<String>();
        }
        if (material!=null){
            this.listaMateriale.add(material);
        }
        return this;
    }

    public PantofBuilder addMesajText(String mesajText) {
        if (this.listaMesajeText == null) {
            this.listaMesajeText = new ArrayList<String>();
        }
        if (mesajText!=null){
            this.listaMesajeText.add(mesajText);
        }
        return this;
    }

    @Override
    public Pantof build() {
        if (numarPantof <35 || numarPantof > 45) {
            throw new RuntimeException("Numarul de pantof trebuie sa fie intre 35 si 45");
        }
        if (dimensiuneToc <0.5 || dimensiuneToc > 12.5) {
            throw new RuntimeException("Dimensiunea tocului trebuie sa fie intre 0.5 și 12.5");
        }
        pantof = new Pantof(tipPantof, numarPantof, dimensiuneToc, material);
        if (listaMateriale!=null && !listaMateriale.isEmpty()) {
            if (tipPantof==TipPantof.Stiletto && listaMateriale.size()>2) {
                throw new RuntimeException("Prea multe materiale pentru tipul de pantof ales");
            }
            for (String materiale : listaMateriale) {
                pantof.addMaterial(materiale);
            }
        }
        if (listaMesajeText!=null && !listaMesajeText.isEmpty()) {
            int totalCaractere = listaMesajeText.stream()
                    .mapToInt(String::length)
                    .sum();
            if (totalCaractere>numarPantof) {
                throw new RuntimeException("Prea multe caractere in mesajele text");
            }
            for (String mesaje : listaMesajeText) {
                pantof.addMesajText(mesaje);
            }
        }
        return pantof;
    }
}
