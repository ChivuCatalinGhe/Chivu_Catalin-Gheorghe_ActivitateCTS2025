package A12.Observer;

public class Abonat implements IObserver {
    private String nume;
    public Abonat(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Pacientul abonat " + this.nume + " a primit mesajul " + mesaj);
    }
}
