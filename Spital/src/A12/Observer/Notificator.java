package A12.Observer;

import java.util.ArrayList;
import java.util.List;

public class Notificator implements ISubiect{
    private List<IObserver> listaObservatori;

    public Notificator() {
        super();
        this.listaObservatori = new ArrayList<IObserver>();
    }


    @Override
    public void adaugaObserver(IObserver observer) {
        listaObservatori.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        listaObservatori.remove(observer);

    }

    @Override
    public void notificaToti(String mesaj) {
        for (IObserver observer : listaObservatori) {
            observer.receptionareMesaj(mesaj);
        }

    }

    public void alertaEpidemie(String epidemie) {
        notificaToti("Epidemie noua : " + epidemie);
    }

    public void alertaVirus(String virus) {
        notificaToti("Virus nou : " + virus);
    }

}
