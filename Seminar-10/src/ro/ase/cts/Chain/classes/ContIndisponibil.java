package ro.ase.cts.Chain.classes;

public class ContIndisponibil extends Cont{

    public ContIndisponibil(String numeClient) {
        super(0, numeClient, null);
    }

    @Override
    public void plateste(float suma) {
        System.out.println("Fonduri insuficiente pentru a retrage suma " + suma);
    }
}