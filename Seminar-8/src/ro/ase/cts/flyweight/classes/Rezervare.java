package ro.ase.cts.flyweight.classes;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;
    public Rezervare(int nrMasa, int nrPersoane, String oraRezervare) {
        super();
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }
    @Override
    public String toString() {
        return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", oraRezervare=" + oraRezervare + "]";
    }


}
