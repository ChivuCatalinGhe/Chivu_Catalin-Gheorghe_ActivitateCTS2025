package BrutarieDecorator.clase;

public class CozonacStafideDecorator extends ACozonacDecorator {
    String descriere;
    public CozonacStafideDecorator(ProdusPanificiatie produsPanificiatie) {
        super(produsPanificiatie);
        this.descriere = super.getDescriere() + " cu stafide";
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.descriere);
    }
}
