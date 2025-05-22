package B11_Strategy.Clase;

public class Card implements IModPlata{

    @Override
    public void plateste(Client client, double suma) {
        System.out.println(client.getNume() + " a platit suma de " + suma + " cu card");
    }
}
