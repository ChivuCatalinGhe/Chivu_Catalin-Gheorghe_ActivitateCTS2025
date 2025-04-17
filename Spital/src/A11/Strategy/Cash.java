package A11.Strategy;

public class Cash implements ModPlata {

    @Override
    public void plateste(Pacient pacient, double sumaPlatita) {
        System.out.println(pacient.getNume() + " a platit " + sumaPlatita + " lei cash");
    }
}
