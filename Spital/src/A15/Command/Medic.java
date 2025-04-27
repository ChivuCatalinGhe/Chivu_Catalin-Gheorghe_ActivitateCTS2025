package A15.Command;

public class Medic {
    private String nume;
    public Medic(String nume) {
        super();
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }

    public void TrateazaImediat(String pacient) {
        System.out.println("Medicul " + this.nume + " a inceput tratamentul pacientului " + pacient);
    }

    public void Interneaza(String pacient, String salon) {
        System.out.print("Pacientul " + pacient + " a fost internat in salonul " + salon + " la medicul " + this.nume);
    }

}
