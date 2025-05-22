package B11_Strategy.Clase;

public class Client {
    private String nume;
    private IModPlata modPlata;
    public Client(String nume, IModPlata modPlata) {
        super();
        this.nume = nume;
        this.modPlata = modPlata;
    }
    public void plateste(double sumaPlatita){
        this.modPlata.plateste(this, sumaPlatita);
    }
    public String getNume() {
        return nume;
    }

}
