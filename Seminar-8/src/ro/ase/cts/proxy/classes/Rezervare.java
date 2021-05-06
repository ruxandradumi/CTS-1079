package ro.ase.cts.proxy.classes;

public class Rezervare implements IRezervare{
    private int nrMasa;
    private int nrPersoane;

    public Rezervare(int nrMasa, int nrPersoane) {
        super();
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public int getNrMasa() {
        return nrMasa;
    }
    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }
    public int getNrPersoane() {
        return nrPersoane;
    }
    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervarea a fost facuta pentru masa "+nrMasa + " pentru "+nrPersoane +" persoane");

    }


}