package A9.Program;

import A9.Proxy.Internare;
import A9.Proxy.Pacient;
import A9.Proxy.ProxyInternare;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion ion",true);
        Pacient pacient2 = new Pacient("Gheorghe Gheorghe",false);

        Internare internare1 = new Internare(pacient1);
        Internare internare2 = new Internare(pacient2);

        internare1.interneaza();
        internare2.interneaza();

        ProxyInternare proxy1 = new ProxyInternare(internare1);
        ProxyInternare proxy2 = new ProxyInternare(internare2);

        proxy1.interneaza();
        proxy2.interneaza();


    }

}
