package BrutarieDecorator.program;

import BrutarieDecorator.clase.*;

public class Main {
    public static void main(String[] args) {
        ProdusPanificiatie cozonacSimplu = new Cozonac();
        System.out.println(cozonacSimplu.getDescriere());

        ACozonacDecorator cozonacNuca = new CozonacNucaDecorator(cozonacSimplu);
        cozonacNuca.afiseazaDescriere();

        ACozonacDecorator cozonacStafide = new CozonacStafideDecorator(new CozonacNucaDecorator(cozonacSimplu));
        cozonacStafide.afiseazaDescriere();
    }
}
