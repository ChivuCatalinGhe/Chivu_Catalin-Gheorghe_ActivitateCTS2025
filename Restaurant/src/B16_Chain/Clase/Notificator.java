package B16_Chain.Clase;

public abstract class Notificator {
    private Notificator urmatorulNotificator;

    public void setUrmatorulNotificator(Notificator notificator) {
        this.urmatorulNotificator = notificator;
    }

    public Notificator getUrmatorulNotificator() {
        return urmatorulNotificator;
    }

    public abstract void notifica(Client client, String mesaj);
}
