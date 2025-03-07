package BrutarieFactory.Clase;

public class Franzela extends ProdusPanificatie {
    public Franzela() {
        super("Franzela", 300f,11.5f);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Produs: " + getDenumire() + ", gramaj: " + getGramaj() + "g., pret: " + getPret() + " lei");
        System.out.println("Descriere: produs de panificatie categorie medie, din faina de grau, apa si sare. Contine gluten !");
    }
}