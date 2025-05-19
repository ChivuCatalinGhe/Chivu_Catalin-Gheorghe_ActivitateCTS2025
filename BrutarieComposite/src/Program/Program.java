package Program;

import Composite.*;

public class Program {
    public static void main (String[] args) {
        Structura structura = new Structura("Structura Brutarie");
        Brutarie brutarie = new Brutarie(structura,"Brutaria Happy");
        ANod punctLucruCumpana = new Structura("PunctLucruCumpana");
        ANod punctLucruConstanta = new Structura("PunctLucruConstanta");
        structura.adaugaNod(punctLucruCumpana);
        structura.adaugaNod(punctLucruConstanta);

        punctLucruCumpana.adaugaNod(new Sectie("Sectia Cumpana"));

        Structura hala1Constanta = new Structura("Hala1 Constanta");
        Structura hala2Constanta = new Structura("Hala2 Constanta");
        punctLucruCumpana.adaugaNod(hala1Constanta);
        punctLucruCumpana.adaugaNod(hala2Constanta);

        hala2Constanta.adaugaNod(new Sectie("Sectia1 Constanta"));
        hala2Constanta.adaugaNod(new Sectie("Sectia2 Constanta"));

        System.out.println("Strucutura Brutarie: " + brutarie.getDenumireBrutarie());
        System.out.println(structura.getInfo());

    }
}
