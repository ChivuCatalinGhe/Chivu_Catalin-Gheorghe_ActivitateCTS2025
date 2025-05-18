package Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> listaComenzi;
    public Operator() {
        this.listaComenzi = new ArrayList<IComanda>();
    }
    public void preiaComanda(IComanda comanda) {
        this.listaComenzi.add(comanda);
        System.out.println("Am preluat comanda " + comanda.getCodComanda());
    }
    public void transmiteComenzi(){
        for (IComanda comanda : this.listaComenzi) {
            comanda.executa();
        }
        this.listaComenzi.clear();
    }

}
