package A13.State;

public class Pacient {
    private String nume;
    private IStare stare;

    public Pacient(String nume) {
        super();
        this.nume = nume;
        stare = new Internat();
        stare.afiseazaStare();
    }

    public void puneSubObservatie(){
        if (this.stare instanceof Internat){
            System.out.println(this.nume + " a fost pus sub observatie");
            stare =  new SubObservatie();
            stare.afiseazaStare();
        } else if (this.stare instanceof SubObservatie) {
            System.out.println(this.nume + " este deja sub observatie");
        } else {
            System.out.println(this.nume + " a fost deja externat");
        }
    }

    public void externeaza(){
        if (this.stare instanceof Internat || this.stare instanceof SubObservatie){
            System.out.println(this.nume + " a fost externat");
            stare =  new Externat();
            stare.afiseazaStare();
        } else {
            System.out.println(this.nume + " a fost deja externat");
        }

    }
}
