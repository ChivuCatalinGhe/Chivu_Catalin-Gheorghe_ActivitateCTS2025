package B16_Chain.Clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }
}
