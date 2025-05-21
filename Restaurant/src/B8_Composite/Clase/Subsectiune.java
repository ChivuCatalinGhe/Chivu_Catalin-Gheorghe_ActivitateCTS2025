package B8_Composite.Clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements IOptiune {
    private List<IOptiune> lista;
    private String denumire;
    public Subsectiune(String denumire) {
        lista = new ArrayList<IOptiune>();
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        lista.remove(optiune);
    }

    @Override
    public IOptiune getOptiune(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println(">>Subsectiune: " + denumire);
        for (IOptiune optiune : lista) {
            optiune.descriere();
        }
    }
}
