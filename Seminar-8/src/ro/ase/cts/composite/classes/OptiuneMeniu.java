package ro.ase.cts.composite.classes;

public interface OptiuneMeniu {
    void adaugaNod(OptiuneMeniu optiune) throws Exception;
    void stergeNod(OptiuneMeniu optiune);
    OptiuneMeniu getNod(int index);
    void descriere();
}