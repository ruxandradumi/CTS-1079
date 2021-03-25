package ro.ase.cts;

public class CategorieFactory {

    public Categorie creareCategorie(CategoriiMedicamente categoriiMedicamente,float pretDeBaza) throws Exception {
        switch(categoriiMedicamente) {
            case raceala:
                return new Raceala(pretDeBaza);
            case durere:
                return new Durere(pretDeBaza);
            case body:
                return new Body(pretDeBaza);
            default:
                throw new Exception("Categorie incorecta!");

        }
    }
}
