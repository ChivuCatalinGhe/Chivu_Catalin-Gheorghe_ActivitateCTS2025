package BrutarieFactory.Clase;

public class PaineNeagra extends ProdusPanificatie{
    public PaineNeagra() {
        super("PaineNeagra", 350f,12f);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Produs: " + getDenumire() + ", gramaj: " + getGramaj() + "g., pret: " + getPret() + " lei");
        System.out.println("Descriere: produs de panificatie categorie medie, din faina de secara, apa si sare. Contine gluten !");
    }

}
