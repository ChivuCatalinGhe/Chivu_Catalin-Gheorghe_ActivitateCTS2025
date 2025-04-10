package A8.Composite;

public abstract class ANod {
    public abstract String getDenumire();

    public String getInfo()
    {
        return this.getDenumire();
    }
    public void adaugaNod(ANod elementStructura)
    {
        throw new UnsupportedOperationException("Neimplementat inca!");
    }

    public void eliminaNod(ANod elementStructura) {
        throw new UnsupportedOperationException("Neimplementat inca!");
    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException("Neimplementat inca!");
    }
}
