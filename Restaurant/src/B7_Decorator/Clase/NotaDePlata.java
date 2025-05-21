package B7_Decorator.Clase;

public class NotaDePlata implements INotaDePlata {
    private String serieSiNr;
    private double valoare;

    public NotaDePlata(String serieSiNr, double valoare) {
        super();
        this.serieSiNr = serieSiNr;
        this.valoare = valoare;
    }

    @Override
    public void printNotaDePlata() {
        System.out.println("Nota de plata " + serieSiNr + ". Aveti de plata " + valoare + "RON");
    }

    public String getSerieSiNr() {
        return serieSiNr;
    }

    public void setSerieSiNr(String serieSiNr) {
        this.serieSiNr = serieSiNr;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }
}
