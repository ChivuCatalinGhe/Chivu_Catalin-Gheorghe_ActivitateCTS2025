package A4.Program;

import A4.Prototype.Reteta;

public class Program {
    public static void main(String[] args) {
        Reteta reteta = new Reteta("Reteta1");
        Reteta reteta2 = (Reteta)reteta.copiere();
        reteta2.afisare();
    }
}
