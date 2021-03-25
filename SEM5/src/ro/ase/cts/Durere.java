package ro.ase.cts;

import ro.ase.cts.Categorie;

public class Durere extends Categorie {

    public Durere(float pretDeBaza) {
        super(pretDeBaza);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Durere [pretDeBaza=");
        builder.append(pretDeBaza);
        builder.append("]");
        return builder.toString();
    }



}
