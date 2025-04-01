package BrutarieDecorator.clase;

public class CozonacNucaDecorator extends ACozonacDecorator {
    String descriere;
    public CozonacNucaDecorator(ProdusPanificiatie produsPanificiatie) {
        super(produsPanificiatie);
        this.descriere = super.getDescriere() + " cu nuca";
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.descriere);
    }
}
