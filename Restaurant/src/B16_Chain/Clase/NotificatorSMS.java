package B16_Chain.Clase;

public class NotificatorSMS extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNrTelefon() != null) {
            System.out.println("SMS trimis catre " + client.getNume() + ": " + mesaj);
        } else {
            if (getUrmatorulNotificator() != null) {
                getUrmatorulNotificator().notifica(client, mesaj);
            }
        }
    }
}
