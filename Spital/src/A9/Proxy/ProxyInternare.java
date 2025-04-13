package A9.Proxy;

public class ProxyInternare implements IInternare {
    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza() {
        if (internare.getPacient() != null && internare.getPacient().getAreAsigurare()) {
            internare.interneaza();
        }
        else {
            System.out.println("Pacientul " + internare.getPacient().getNume() + " nu are asigurare !");
        }
    }
}
