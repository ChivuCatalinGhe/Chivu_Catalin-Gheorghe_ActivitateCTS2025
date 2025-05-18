package Template;

public abstract class APreparare {
    public APreparare() {
        super();
    }

    abstract void preparaCoca();
    abstract void bagaLaCuptor();
    abstract void ambaleaza();

    public final void proceduraPreparare(){
        preparaCoca();
        bagaLaCuptor();
        ambaleaza();
    }
}
