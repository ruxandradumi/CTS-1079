package ro.ase.cts.Chain.classes;

public class ContCurent extends Cont{

    public ContCurent(float sold, String numeClient, Cont succesor) {
        super(sold, numeClient, succesor);
    }

    @Override
    public void plateste(float suma) {
        if(super.getSold() >=  suma) {
            System.out.println(super.getNumeClient() + " a realizat plata de " +  suma + " din contul curent");
        }
        else {
            super.getSuccesor().plateste(suma);
        }
    }
}
