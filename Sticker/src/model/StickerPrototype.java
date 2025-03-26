package model;

import java.util.Objects;

public class StickerPrototype implements Cloneable {
    String model;
    int dimensiuneX;
    int dimensiuneY;

    public StickerPrototype(Masina masina) {
        if (masina != null) {
            this.model = masina.getModelMasina();
            if (Objects.equals(masina.getModelMasina(), "Dacia") && masina.getAnFabricatie() == 2000) {
                this.dimensiuneX= 10;
                this.dimensiuneY= 10;
            } else if (Objects.equals(masina.getModelMasina(), "Renault") && masina.getAnFabricatie() == 2022) {
                this.dimensiuneX= 15;
                this.dimensiuneY= 10;
            }
        }
    }

    @Override
    public StickerPrototype clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (StickerPrototype) clone;
    }

    public void afiseaza(){
        System.out.println("Sticker pentru "+ this.model + ": " + this.dimensiuneX + " / " + this.dimensiuneY);
    }
}
