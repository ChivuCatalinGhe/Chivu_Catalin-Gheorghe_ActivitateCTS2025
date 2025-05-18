package Template;

public class prepararePaine extends APreparare{
    public prepararePaine() {
        super();
    }

    @Override
    void preparaCoca() {
        System.out.println("Preparam coca pentru paine");
    }

    @Override
    void bagaLaCuptor() {
        System.out.println("Baga la cuptor paine");
    }

    @Override
    void ambaleaza() {
        System.out.println("Ambaleaza paine");
    }


}
