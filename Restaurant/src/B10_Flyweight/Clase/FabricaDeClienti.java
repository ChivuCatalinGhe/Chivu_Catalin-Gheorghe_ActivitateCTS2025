package B10_Flyweight.Clase;

import java.util.HashMap;

public class FabricaDeClienti {
    private HashMap<String, Client> clienti = new HashMap<>();

    public Client getClient(String nume, String nrTelefon, String email) {
        if (!clienti.containsKey(nume)) {
            Client clientNou = new Client(nume, nrTelefon, email);
            clienti.put(nume, clientNou);
        }
        return clienti.get(nume);
    }

    public int getNumarClienti() {
        return clienti.size();
    }
}
