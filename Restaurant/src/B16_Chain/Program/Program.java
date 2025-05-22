package B16_Chain.Program;

import B16_Chain.Clase.*;

public class Program {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client1 = new Client("Popescu Ion", "0722333444", "popescu@email.com");
        Client client2 = new Client("Ionescu Ana", null, "ana.ionescu@gmail.com");
        Client client3 = new Client("Georgescu Vlad", null, null);

        notificatorSMS.notifica(client1, "Rezervarea ta este confirmata.");
        notificatorSMS.notifica(client2, "Te așteptam la ora 19:00.");
        notificatorSMS.notifica(client3, "Te rugam sa ne contactezi pentru detalii.");
    }
}
