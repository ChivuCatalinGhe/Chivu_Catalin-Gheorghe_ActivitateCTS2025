package B14_Template.Clase;

public abstract class AOcupareMasa {
    protected Masa masa;
    public AOcupareMasa(Masa masa) {
        super();
        this.masa = masa;
    }
    abstract void curataMasa();
    abstract void aseazaServetele();
    abstract void aseazaTacamuri();
    abstract void invitaClienti();

    public final void proceduraOcupareMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaClienti();
    }
}
