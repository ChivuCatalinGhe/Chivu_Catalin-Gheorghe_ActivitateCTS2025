package BrutarieFactory.Clase;

public class BrutarieFactory {

    public ProdusPanificatie creazaProdusPanificatie(CategorieProdus categorieProdus) throws Exception{
            switch (categorieProdus) {
            case franzela:
                return new Franzela();
            case paineNeagra:
                return new PaineNeagra();
            case covrig:
                return new Covrig();
                default:
                    throw new Exception("Nu exista categoria de produs selectata");
            }
    }
}
