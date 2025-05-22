package B16_Chain.Clase;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getAdresaEmail() != null) {
            System.out.println("Email trimis catre " + client.getNume() + ": " + mesaj);
        } else {
            if (getUrmatorulNotificator() != null) {
                getUrmatorulNotificator().notifica(client, mesaj);
            }
        }
    }
}
