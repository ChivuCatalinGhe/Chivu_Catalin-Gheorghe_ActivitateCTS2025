package B8_Composite.Clase;

public interface IOptiune {
    void adaugaNod(IOptiune optiune) throws Exception;
    void stergeNod(IOptiune optiune) throws Exception;
    IOptiune getOptiune(int index) throws Exception;
    void descriere();
}
