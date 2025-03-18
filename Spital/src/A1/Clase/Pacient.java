package A1.Clase;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean areHalat;
    private boolean arePapuci;

    Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun,
            boolean areHalat, boolean arePapuci) {
        super();
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.areHalat = areHalat;
        this.arePapuci = arePapuci;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public boolean isAreHalat() {
        return areHalat;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public boolean isArePapuci() {
        return arePapuci;
    }

    public void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", areHalat=" + areHalat +
                ", arePapuci=" + arePapuci +
                '}';
    }
}
