package A6.Facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int numarPaturi;
    private List<Integer> listaPaturiLibere;

    public Salon(int numarPaturi){
        this.numarPaturi = numarPaturi;
        listaPaturiLibere = new ArrayList<Integer>();
        for (int i = 0; i < this.numarPaturi; i++) {
            listaPaturiLibere.add(i+1);
        }
    }

    public void ocupaPat(){
        if (!listaPaturiLibere.isEmpty()){
        this.listaPaturiLibere.remove(0);
        }
    }

    public void elibereazaPat(){
        if (!listaPaturiLibere.isEmpty()){
            int patLiberNou = listaPaturiLibere.get(0)-1;
            this.listaPaturiLibere.add(0,patLiberNou);
        }
        else {
            this.listaPaturiLibere.add(1);
        }
    }

    public boolean verificarePatLiber()
    {
        return !listaPaturiLibere.isEmpty();
    }
}
