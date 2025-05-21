package B9_Proxy.Clase;

public class RezervareProxy implements IRezervare {
    private Rezervare rezervare;
    public RezervareProxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva() {
        if (this.rezervare.getNrPersoane() >= 4)
        {
            rezervare.rezerva();
        }
        else {
            System.out.println("Nu se poate efectua rezervarea. Numar de persoane prea mic !");
        }
    }
}
