package B16_Chain.Clase;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Notificare manager: clientul " + client.getNume() +
                " nu are date de contact. Mesaj: " + mesaj);
    }
}
