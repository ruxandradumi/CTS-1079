package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype {

    private int cod;
    private String echipaA;
    private String echipaB;
    private String data;


    public Bilet()
    {
        super();
    }

    public Bilet(int cod, String echipaA, String echipaB, String data) {
        this.cod = cod;
        this.echipaA = echipaA;
        this.echipaB = echipaB;
        this.data = data;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "cod=" + cod +
                ", echipaA='" + echipaA + '\'' +
                ", echipaB='" + echipaB + '\'' +
                ", data='" + data + '\'' +
                '}';
    }


    @Override
    public AbstractPrototype copiaza() {
        Bilet bilet= new Bilet();
        bilet.setCod(this.cod);
        bilet.data=this.data;
        bilet.echipaA=this.echipaA;
        bilet.echipaB=this.echipaB;
        return bilet;
    }
}
