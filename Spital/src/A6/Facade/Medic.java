package A6.Facade;

public class Medic {
    private String nume;

    public Medic(String nume)
    {
        this.nume = nume;
    }

    public String getNume()
    {
        return this.nume;
    }
    public boolean confirmaInternare(Pacient pacient)
    {
        return pacient.isStareGrava();
    }
}
