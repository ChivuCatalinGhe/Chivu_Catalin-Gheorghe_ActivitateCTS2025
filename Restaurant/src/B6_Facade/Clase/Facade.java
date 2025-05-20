package B6_Facade.Clase;

public class Facade {
    public static String verificaMasa(Masa masa){
        if (!masa.esteLibera()) {
            return "Masa " + masa.getNumar() + " nu este libera.";
        }
        if (!masa.esteDebarasata()) {
            return "Masa " + masa.getNumar() + " nu este debarasata.";
        }
        if (!masa.areServetele()) {
            return "Masa " + masa.getNumar() + " nu are servetele.";
        }

        return "Masa " + masa.getNumar() + " este gata pentru a fi ocupata.";
    }
}
