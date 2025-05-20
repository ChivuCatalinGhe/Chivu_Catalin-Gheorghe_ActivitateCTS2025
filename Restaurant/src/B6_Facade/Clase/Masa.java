package B6_Facade.Clase;

public class Masa {
    private int numar;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServetele;

    public Masa(int numar, boolean esteLibera, boolean esteDebarasata, boolean areServetele) {
        this.numar = numar;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServetele = areServetele;
    }

    public boolean esteLibera() {
        return esteLibera;
    }

    public boolean esteDebarasata() {
        return esteDebarasata;
    }

    public boolean areServetele() {
        return areServetele;
    }

    public int getNumar() {
        return numar;
    }
}
