package Program;
import BrutarieEager.BrutarieEager;
import BrutarieLazy.BrutarieLazy;
import BrutarieThreadSafe.BrutarieThreadSafe;


public class Program {
    public static void main(String[] args) {
        BrutarieEager brutaria1=BrutarieEager.getInstanta("MyBakery","Strada Galbelna nr. 4",234569);
        BrutarieLazy brutaria2=BrutarieLazy.getInstanta("Brutaria Lazy","Strada Panselutelor nr. 10",1115551);
        BrutarieLazy brutaria3=BrutarieLazy.getInstanta("Brutaria Puff","Strada Panselutelor nr. 10",1115551);
        BrutarieThreadSafe brutaria4=BrutarieThreadSafe.getInstanta("Brutaria Sigura","Strada Zidarilor nr. 8",222455);

        System.out.println(brutaria1.getDenumire() + " / " + brutaria1.getAdresa());
        System.out.println(brutaria2.getDenumire() + " / " + brutaria2.getAdresa());
        System.out.println(brutaria3.getDenumire() + " / " + brutaria3.getAdresa());
        System.out.println(brutaria4.getDenumire() + " / " + brutaria4.getAdresa());
    }
}
