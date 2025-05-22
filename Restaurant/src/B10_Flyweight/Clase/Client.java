package B10_Flyweight.Clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    public void afisareInfo(String dataRezervare, int nrPersoane, int masa) {
        System.out.println("Rezervare pentru " + nume +
                " (Tel: " + nrTelefon + ", Email: " + adresaEmail + ") " +
                "-> Data: " + dataRezervare + ", Masa: " + masa + ", Persoane: " + nrPersoane);
    }
}
