package B14_Template.Program;

import B14_Template.Clase.AOcupareMasa;
import B14_Template.Clase.Masa;
import B14_Template.Clase.OcupareMasa;

public class Program {
    public static void main(String[] args){
        Masa masa1 = new Masa("A1");
        AOcupareMasa ocupareMasa1 = new OcupareMasa(masa1);
        ocupareMasa1.proceduraOcupareMasa();
    }
}
