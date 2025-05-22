package B11_Strategy.Program;

import B11_Strategy.Clase.Client;
import B11_Strategy.Clase.Card;
import B11_Strategy.Clase.Cash;

public class Program {
    public static void main(String[] args) {
        Client client1 = new Client("Ion Ion", new Card());
        Client client2 = new Client("Gheo Gheo", new Cash());
        client1.plateste(100);
        client2.plateste(155);
    }
}
