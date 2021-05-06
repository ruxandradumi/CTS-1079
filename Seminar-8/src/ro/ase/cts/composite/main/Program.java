package ro.ase.cts.composite.main;

import ro.ase.cts.composite.classes.Item;
import ro.ase.cts.composite.classes.OptiuneMeniu;
import ro.ase.cts.composite.classes.Sectiune;

public class Program {

    public static void main(String[] args) {
        OptiuneMeniu meniu= new Sectiune("Meniu restaurant");
        OptiuneMeniu optiune1= new Sectiune("bauturi");
        OptiuneMeniu optiune2= new Sectiune("desert");

        OptiuneMeniu item1= new Item("frappe");
        OptiuneMeniu item2= new Item("apa plata");
        OptiuneMeniu item3= new Item("papanasi");

        try {
            optiune1.adaugaNod(item1);
            optiune1.adaugaNod(item2);

            optiune2.adaugaNod(item3);

            meniu.adaugaNod(optiune1);
            meniu.adaugaNod(optiune2);

            meniu.descriere();

            optiune1.stergeNod(item1);
            optiune2.adaugaNod(item1);
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
