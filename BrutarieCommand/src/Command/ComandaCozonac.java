package Command;

public class ComandaCozonac implements IComanda {
    private String codComanda;
    private Brutar brutar;
    public ComandaCozonac(String codComanda,Brutar brutar) {
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
        this.brutar.preparaCozonac();
    }
}
