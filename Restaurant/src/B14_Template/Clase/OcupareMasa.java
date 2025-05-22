package B14_Template.Clase;

public class OcupareMasa extends AOcupareMasa{
    public OcupareMasa(Masa masa) {
        super(masa);
    }
    @Override
    void curataMasa() {
        System.out.println("Masa " + masa.getNumarMasa() + " a fost curatata");
    }

    @Override
    void aseazaServetele() {
        System.out.println("Pe masa " + masa.getNumarMasa() + " au fost aseazate servetele");
    }

    @Override
    void aseazaTacamuri() {
        System.out.println("Pe masa" + masa.getNumarMasa() + " au fost aseazate tacamuri");
    }
    @Override
    void invitaClienti() {
        System.out.println("La masa" + masa.getNumarMasa() + " au fost invitati clientii");
    }
}
