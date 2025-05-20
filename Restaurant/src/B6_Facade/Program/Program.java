package B6_Facade.Program;

import B6_Facade.Clase.Facade;
import B6_Facade.Clase.Masa;

public class Program {
    public static void main(String[] args){
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, false, true, true);
        Masa masa3 = new Masa(3, true, false, true);
        Masa masa4 = new Masa(4, true, true, false);

        System.out.println(Facade.verificaMasa(masa1));
        System.out.println(Facade.verificaMasa(masa2));
        System.out.println(Facade.verificaMasa(masa3));
        System.out.println(Facade.verificaMasa(masa4));
    }

}
