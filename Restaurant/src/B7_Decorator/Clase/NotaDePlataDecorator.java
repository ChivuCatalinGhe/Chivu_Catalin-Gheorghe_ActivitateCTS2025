package B7_Decorator.Clase;

public abstract class NotaDePlataDecorator implements INotaDePlata {
    protected NotaDePlata notaDePlata;
    public NotaDePlataDecorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printNotaDePlata() {
        notaDePlata.printNotaDePlata();
        System.out.println("La Multi Ani !");
    }
}
