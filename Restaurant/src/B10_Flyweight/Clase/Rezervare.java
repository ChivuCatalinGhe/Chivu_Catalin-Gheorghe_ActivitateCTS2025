package B10_Flyweight.Clase;

public class Rezervare {
    private String dataRezervare;
    private int nrPersoane;
    private int nrMasa;

    public Rezervare(String dataRezervare, int nrPersoane, int nrMasa) {
        this.dataRezervare = dataRezervare;
        this.nrPersoane = nrPersoane;
        this.nrMasa = nrMasa;
    }

    public void afisare(Client client) {
        client.afisareInfo(dataRezervare, nrPersoane, nrMasa);
    }
}
