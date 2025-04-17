package A12.Observer;

public interface ISubiect {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void notificaToti(String mesaj);
}
