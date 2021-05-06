package ro.ase.cts.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements OptiuneMeniu{
    List<OptiuneMeniu> lista;
    private String nume;
    public Sectiune(String nume) {
        super();
        this.lista = new ArrayList<OptiuneMeniu>();
        this.nume = nume;
    }
    @Override
    public void adaugaNod(OptiuneMeniu optiune) {
        lista.add(optiune);

    }
    @Override
    public void stergeNod(OptiuneMeniu optiune) {
        lista.remove(optiune);

    }
    @Override
    public OptiuneMeniu getNod(int index) {
        return lista.get(index);
    }
    @Override
    public void descriere() {
        System.out.println("Sectiunea " + nume + " are urmatoarele subsectiuni:");
        for(OptiuneMeniu optiune : lista)
            optiune.descriere();
    }
}