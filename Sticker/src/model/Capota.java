package model;

public class Capota implements IComponenta{
    String culoare;
    String tipMaterial;
    Boolean esteDetasabila;

    Capota(String culoare, String tipMaterial, Boolean esteDetasabila) {
        this.culoare = culoare;
        this.tipMaterial = tipMaterial;
        this.esteDetasabila = esteDetasabila;
    }

    @Override
    public String getCuloareComponenta() {
        return this.culoare;
    }

    @Override
    public String tipMaterial() {
        return this.tipMaterial;
    }

    @Override
    public boolean esteDetasabila() {
        return this.esteDetasabila;
    }
}
