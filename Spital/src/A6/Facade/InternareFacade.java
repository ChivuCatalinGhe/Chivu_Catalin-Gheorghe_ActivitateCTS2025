package A6.Facade;

public class InternareFacade {
    public static String verificareInternare(Pacient pacient, Medic medic, Salon salon)
    {
        Boolean confirmare = false;
        if (pacient.isStareGrava())
        {
            confirmare = medic.confirmaInternare(pacient);
        }
        if (confirmare) {
            if (salon.verificarePatLiber()) {
                return "Pacientul " + pacient.getNume() + " a fost confirmat de medicul "
                        + medic.getNume() + " si poate fi internat";
            }
            else {
                return "Nu sunt paturi libere in salon !";
            }
        }
        else {
            return "Nu a fost confirmata internarea !";
        }

    }
}
