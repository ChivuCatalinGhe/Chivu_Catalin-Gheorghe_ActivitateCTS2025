package B7_Decorator.Program;

import B7_Decorator.Clase.NotaDePlata;
import B7_Decorator.Clase.NotaDePlataDecorata;
import B7_Decorator.Clase.NotaDePlataDecorator;

public class Program {
    public static void main (String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata("A1",10.5);
        notaDePlata.printNotaDePlata();
        NotaDePlataDecorator nota2 = new NotaDePlataDecorata(notaDePlata);
        nota2.printNotaDePlata();
    }
}
