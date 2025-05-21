package B8_Composite.Clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiune {
    private List<IOptiune> lista;
    private String denumire;
    public Sectiune(String denumire) {
        this.lista = new ArrayList<IOptiune>();
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        this.lista.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        this.lista.remove(optiune);
    }

    @Override
    public IOptiune getOptiune(int index) throws Exception {
        return this.lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println(">Sectiune: " + denumire);
        for (IOptiune optiune : this.lista) {
            optiune.descriere();
        }
    }
}
