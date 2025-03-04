package Program;
import BrutarieEager.BrutarieEager;

public class Program {
    public static void main(String[] args) {
        BrutarieEager brutaria1=BrutarieEager.getInstanta("MyBakery","Strada Galbelna nr. 4",234569);

        System.out.println(brutaria1.getAdresa());
    }
}
