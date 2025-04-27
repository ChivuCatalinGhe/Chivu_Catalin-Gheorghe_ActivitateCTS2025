package A15.Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<IComanda>();
    }

    public void preiaComanda(IComanda comanda) {
        this.listaComenzi.add(comanda);
    }

    public void transmiteComenzile() {
        for (IComanda comanda :  this.listaComenzi) {
            comanda.executa();
        }
        this.listaComenzi.clear();
    }
}
