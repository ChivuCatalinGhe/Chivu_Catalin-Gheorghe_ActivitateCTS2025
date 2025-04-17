package A12.Program;

import A12.Observer.Abonat;
import A12.Observer.Notificator;

public class Program {
    public static void main(String[] args) {
        Abonat abonat1 = new Abonat("Ion");
        Abonat abonat2 = new Abonat("Vasile");

        Notificator notificator = new Notificator();

        notificator.adaugaObserver(abonat1);
        notificator.adaugaObserver(abonat2);
        notificator.alertaEpidemie("Ebola");
        notificator.alertaEpidemie("SARS Cov 3");
    }
}
