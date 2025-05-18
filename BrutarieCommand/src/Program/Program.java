package Program;

import Command.*;

public class Program {
    public static void main(String[] args) {

        Brutar b1 = new Brutar("Gicu");
        IComanda c1 = new ComandaCozonac("c1", b1);
        IComanda c2 = new ComandaPaine("c2", b1);

        Operator operator = new Operator();
        operator.preiaComanda(c1);
        operator.preiaComanda(c2);

        operator.transmiteComenzi();
    }
}
