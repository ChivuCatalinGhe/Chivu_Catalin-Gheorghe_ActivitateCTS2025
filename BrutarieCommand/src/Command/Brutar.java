package Command;

public class Brutar {
    private String nume;
    public Brutar(String nume) {
        super();
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void preparaPaine()
    {
        System.out.println("Bucatarul " + this.nume + " prepara paine");
    }

    public void preparaCozonac()
    {
        System.out.println("Bucatarul " + this.nume + " prepara cozonac");
    }

}
