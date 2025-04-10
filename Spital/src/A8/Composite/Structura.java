package A8.Composite;

import java.util.ArrayList;

public class Structura extends ANod{
    ArrayList<ANod> structura = new ArrayList<>();
    String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException("Neimplementat inca!");
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.numeStructura + "\n";
        for (ANod nod : structura){
            info += " " + nod.getInfo() + "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod nod) {
        structura.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        structura.remove(nod);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}
