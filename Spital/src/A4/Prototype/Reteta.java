package A4.Prototype;

public class Reteta implements IReteta{
    private String denumire;

    public Reteta(){

    }

    public Reteta(String denumire){
        super();
        this.denumire = denumire;
    }


    @Override
    public IReteta copiere() {
        Reteta reteta = new Reteta();
        reteta.denumire = this.denumire;
        return reteta;
    }

    public void afisare(){
        System.out.println(this.denumire);
    }
}
