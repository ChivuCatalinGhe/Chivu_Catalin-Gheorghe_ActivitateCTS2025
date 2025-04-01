package BrutarieDecorator.clase;

public abstract class ACozonacDecorator implements ProdusPanificiatie {
    private ProdusPanificiatie produsPanificiatie;
    public ACozonacDecorator(ProdusPanificiatie produsPanificiatie) {
        this.produsPanificiatie = produsPanificiatie;
    }

    public String getDescriere(){
        return produsPanificiatie.getDescriere();
    }

    public abstract void afiseazaDescriere();
}
