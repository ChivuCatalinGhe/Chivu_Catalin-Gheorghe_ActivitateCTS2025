package pantofiBuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private TipPantof tipPantof;
    private int numarPantof;
    private int dimensiuneToc;
    private String material;
    private List<String> listaMateriale = null;
    private List<String> listaMesajeText = null;

    Pantof(TipPantof tipPantof, int numarPantof, int dimensiuneToc, String material) {
        super();
        this.tipPantof = tipPantof;
        this.numarPantof = numarPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
    }

    public TipPantof getTipPantof() {
        return tipPantof;
    }

    void setTipPantof(TipPantof tipPantof) {
        this.tipPantof = tipPantof;
    }

    public int getNumarPantof() {
        return numarPantof;
    }

    void setNumarPantof(int numarPantof) {
        this.numarPantof = numarPantof;
    }

    public int getDimensiuneToc() {
        return dimensiuneToc;
    }

    void setDimensiuneToc(int dimensiuneToc) {
        this.dimensiuneToc = dimensiuneToc;
    }

    public String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void addMaterial(String material) {
        if (this.listaMateriale == null) {
            this.listaMateriale = new ArrayList<String>();
        }
        if (material!=null){
            this.listaMateriale.add(material);
        }
    }

    void addMesajText(String mesajText) {
        if (this.listaMesajeText == null) {
            this.listaMesajeText = new ArrayList<String>();
        }
        if (mesajText!=null){
            this.listaMesajeText.add(mesajText);
        }
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", numarPantof=" + numarPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", material='" + material + '\'' +
                ", listaMateriale=" + listaMateriale +
                ", listaMesajeText=" + listaMesajeText +
                '}';
    }
}
