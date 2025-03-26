package model;

public class Usa implements IComponenta{
    String culoare;
    String tipMaterial;
    Boolean esteDetasabila;

    Usa(String culoare, String tipMaterial, Boolean esteDetasabila) {
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
