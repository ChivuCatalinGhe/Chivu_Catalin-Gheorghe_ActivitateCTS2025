package B8_Composite.Clase;

public class Item implements IOptiune {
    private String denumire;
    public Item(String denumire) {
        this.denumire = denumire;
    }


    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        throw new Exception("neimplementat");
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        throw new Exception("neimplementat");
    }

    @Override
    public IOptiune getOptiune(int index) throws Exception {
        throw new Exception("neimplementat");
    }

    @Override
    public void descriere() {
        System.out.println(">>>Item: " + denumire);
    }
}
