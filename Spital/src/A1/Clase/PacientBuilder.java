package A1.Clase;

public class PacientBuilder implements IBuilder {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean areHalat;
    private boolean arePapuci;

    public PacientBuilder() {
        this.nume = "";
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.areHalat = false;
        this.arePapuci = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume, arePatRabatabil, areMicDejun, areHalat, arePapuci);
    }

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }
}
