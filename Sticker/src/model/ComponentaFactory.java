package model;

public class ComponentaFactory{
    public IComponenta creareComponenta(
            ETipComponenta tipComponenta,
            String culoare,
            String material,
            Boolean esteDetasabila)
            throws Exception {
        switch(tipComponenta)
        {
            case USA:
                return new Usa(culoare,material,esteDetasabila);
            case CAPOTA:
                return new Capota(culoare,material,esteDetasabila);
            default:
                throw new Exception ("Nu este o componenta valida !");
        }
    }
}
