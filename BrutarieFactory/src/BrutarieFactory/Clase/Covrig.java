package BrutarieFactory.Clase;

public class Covrig extends ProdusPanificatie {

    public Covrig() {
        super("Covrig", 150f,7.5f);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Produs: " + getDenumire() + ", gramaj: " + getGramaj() + "g., pret: " + getPret() + " lei");
        System.out.println("Descriere produs: produs mic de panificatie, din faina de grau, apa si sare. Contine gluten !");
    }
}
