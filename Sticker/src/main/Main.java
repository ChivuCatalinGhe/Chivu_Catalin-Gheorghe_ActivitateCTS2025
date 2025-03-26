package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        Masina dacia2000 = new Masina("Dacia", 2000);
        Masina renault2022 = new Masina("Renault", 2022);

        StickerPrototype sticker1 = new StickerPrototype(dacia2000);
        StickerPrototype sticker2 = new StickerPrototype(renault2022);
        StickerPrototype sticker3 = sticker1.clone();
        StickerPrototype sticker4 = sticker2.clone();

        sticker1.afiseaza();
        sticker2.afiseaza();
        sticker3.afiseaza();
        sticker4.afiseaza();

        ComponentaFactory componentaFactory = new ComponentaFactory();
        IComponenta iComponenta1 = null;
        IComponenta iComponenta2 = null;
        IComponenta iComponenta3 = null;
        IComponenta iComponenta4 = null;
        try {
            iComponenta1 = componentaFactory.creareComponenta(
                    ETipComponenta.CAPOTA,"rosu","metal",true);
            iComponenta2 = componentaFactory.creareComponenta(
                    ETipComponenta.USA,"verde","metal",false);
            iComponenta3 = componentaFactory.creareComponenta(
                    ETipComponenta.CAPOTA,"albastru","metal",true);
            iComponenta4 = componentaFactory.creareComponenta(
                    ETipComponenta.USA,"alb","metal",false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(iComponenta1.getCuloareComponenta() + " " +
                iComponenta1.tipMaterial() + " detasabila : " +
                iComponenta1.esteDetasabila());
        System.out.println(iComponenta2.getCuloareComponenta() + " " +
                iComponenta2.tipMaterial() + " detasabila : " +
                iComponenta2.esteDetasabila());
        System.out.println(iComponenta3.getCuloareComponenta() + " " +
                iComponenta3.tipMaterial() + " detasabila : " +
                iComponenta3.esteDetasabila());
        System.out.println(iComponenta4.getCuloareComponenta() + " " +
                iComponenta4.tipMaterial() + " detasabila : " +
                iComponenta4.esteDetasabila());

    }
}
