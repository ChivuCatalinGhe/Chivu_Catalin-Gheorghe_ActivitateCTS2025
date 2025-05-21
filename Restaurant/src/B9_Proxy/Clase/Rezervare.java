package B9_Proxy.Clase;

public class Rezervare implements IRezervare {
    private String numeRezervare;
    private int nrPersoane;
    public Rezervare(String numeRezervare, int nrPersoane) {
        this.numeRezervare = numeRezervare;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervare efectuate pe numele : " +  this.numeRezervare + " pentru " + this.nrPersoane + " persoane");
    }
}
