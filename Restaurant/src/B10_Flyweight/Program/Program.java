package B10_Flyweight.Program;

import B10_Flyweight.Clase.Client;
import B10_Flyweight.Clase.FabricaDeClienti;
import B10_Flyweight.Clase.Rezervare;

public class Program {
    public static void main (String[] args) {
        FabricaDeClienti fabrica = new FabricaDeClienti();

        Client client1 = fabrica.getClient("Popescu Ion", "0711111111", "popescu@gmail.com");
        Client client2 = fabrica.getClient("Ionescu Ana", "0722222222", "ionescu@yahoo.com");
        Client client3 = fabrica.getClient("Popescu Ion", "0711111111", "popescu@gmail.com");

        Rezervare r1 = new Rezervare("2025-06-01", 4, 12);
        Rezervare r2 = new Rezervare("2025-06-05", 2, 8);
        Rezervare r3 = new Rezervare("2025-06-07", 6, 15);

        r1.afisare(client1);
        r2.afisare(client2);
        r3.afisare(client3);

        System.out.println("Numar total obiecte Client create: " + fabrica.getNumarClienti());
    }
}
