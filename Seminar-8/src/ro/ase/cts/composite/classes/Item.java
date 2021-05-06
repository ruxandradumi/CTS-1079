package ro.ase.cts.composite.classes;

public class Item implements OptiuneMeniu{
    private String nume;

    public Item(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(OptiuneMeniu optiune) throws Exception{
        throw new Exception("Exceptie");
    }

    @Override
    public void stergeNod(OptiuneMeniu optiune) {
        throw new IllegalArgumentException("Exceptie");
    }

    @Override
    public OptiuneMeniu getNod(int index) {
        throw new IllegalArgumentException("Exceptie");
    }

    @Override
    public void descriere() {
        System.out.println("Item " + nume);
    }
}