package ro.ase.cts.main;

import ro.ase.cts.Categorie;
import ro.ase.cts.CategorieFactory;
import ro.ase.cts.CategoriiMedicamente;

public class Program {

    public static CategoriiMedicamente getTipCategorie() {
        return CategoriiMedicamente.raceala;
    }

    public static void main(String[] args) {
        CategorieFactory categorieFactory = new CategorieFactory();
        try {
            Categorie durere = categorieFactory.creareCategorie(CategoriiMedicamente.durere, 40f);
            Categorie body = categorieFactory.creareCategorie(CategoriiMedicamente.body, 50f);
            Categorie categorie = categorieFactory.creareCategorie(getTipCategorie(), 30f);

            System.out.println(durere.toString());
            System.out.println(body.toString());
            System.out.println(categorie.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}