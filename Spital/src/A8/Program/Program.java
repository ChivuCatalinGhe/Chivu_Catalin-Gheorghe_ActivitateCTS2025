package A8.Program;

import A8.Composite.*;

public class Program {
    public static void main(String[] args) {
        Structura structuraSpital = new Structura("Structura Spital");
        Spital spital = new Spital(structuraSpital, "Spital");
        ANod departamentChirurgie = new Structura("Chirurige");
        ANod departamentOrtopedie = new Structura("Ortopedie");
        ANod departamentUrgente = new Structura("Urgente");
        structuraSpital.adaugaNod(departamentChirurgie);
        structuraSpital.adaugaNod(departamentOrtopedie);
        structuraSpital.adaugaNod(departamentUrgente);

        departamentUrgente.adaugaNod(new Sectie("Sectia ATI"));

        Structura subChirurgieGenerala = new Structura("Subdepartament Chirurgie Generala");
        Structura subChirurgiePlastica = new Structura("Subdepartament Chirurgie Plastica");
        departamentChirurgie.adaugaNod(subChirurgieGenerala);
        departamentChirurgie.adaugaNod(subChirurgiePlastica);

        Structura subOrtopedie = new Structura("Subdepartament Ortopedie");
        departamentOrtopedie.adaugaNod(subOrtopedie);

        subOrtopedie.adaugaNod(new Sectie("Sectia 1"));
        subOrtopedie.adaugaNod(new Sectie("Sectia 2"));

        subChirurgiePlastica.adaugaNod(new Sectie("Sectia Chirurgie Plastica"));
        subChirurgieGenerala.adaugaNod(new Sectie("Sectia 1"));
        subChirurgieGenerala.adaugaNod(new Sectie("Sectia 2"));

        System.out.println(spital.getDenumireSpital());
        System.out.println(structuraSpital.getInfo());




    }
}
