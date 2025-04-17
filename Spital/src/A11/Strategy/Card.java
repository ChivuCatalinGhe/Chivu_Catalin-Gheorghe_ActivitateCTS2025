package A11.Strategy;

public class Card implements ModPlata {

    @Override
    public void plateste(Pacient pacient, double sumaPlatita) {
        System.out.println(pacient.getNume() + " a platit " + sumaPlatita + " lei cu cardul");
    }
}
