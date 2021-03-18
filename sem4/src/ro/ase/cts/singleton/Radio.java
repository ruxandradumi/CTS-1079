package ro.ase.cts.singleton;




public class Radio {
    private String nume;
    private float frecventa;
    private int speakere;

    private static Radio instanta = null;


    private Radio(String nume, float frecventa, int speakere) {
        super();
        this.nume = nume;
        this.frecventa = frecventa;
        this.speakere = speakere;

    }

    public static synchronized Radio getInstance(String nume, float frecventa, int speakere) {
        if (instanta == null) {
            instanta = new Radio(nume, frecventa, speakere);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "nume='" + nume + '\'' +
                ", frecventa=" + frecventa +
                ", speakere=" + speakere +
                '}';
    }
}