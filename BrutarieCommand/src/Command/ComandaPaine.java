package Command;

public class ComandaPaine implements IComanda{
    private String codComanda;
    private Brutar brutar;
    public ComandaPaine(String codComanda, Brutar brutar) {
        super();
        this.codComanda = codComanda;
        this.brutar = brutar;
    }

    @Override
    public String getCodComanda() {
        return this.codComanda;
    }

    @Override
    public void executa() {
        this.brutar.preparaPaine();
    }
}
