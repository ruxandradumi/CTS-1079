package ro.ase.cts.classes.v1builder;

public class Rezervare {
    public boolean mancareInclusa;
    private boolean scaundErgonomic;
    private boolean bauturaRacoritare;
    private boolean muzicaAmbientala;
    private String genMuzica;
    private int codRezervare;

    public Rezervare(boolean mancareInclusa, boolean scaundErgonomic, boolean bauturaRacoritare, boolean muzicaAmbientala, String genMuzica, int codRezervare) {
        this.mancareInclusa = mancareInclusa;
        this.scaundErgonomic = scaundErgonomic;
        this.bauturaRacoritare = bauturaRacoritare;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
        this.codRezervare = codRezervare;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaundErgonomic() {
        return scaundErgonomic;
    }

    public void setScaundErgonomic(boolean scaundErgonomic) {
        this.scaundErgonomic = scaundErgonomic;
    }

    public boolean isBauturaRacoritare() {
        return bauturaRacoritare;
    }

    public void setBauturaRacoritare(boolean bauturaRacoritare) {
        this.bauturaRacoritare = bauturaRacoritare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaundErgonomic=" + scaundErgonomic +
                ", bauturaRacoritare=" + bauturaRacoritare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                ", codRezervare=" + codRezervare +
                '}';
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
    }

    public void setMuzicaAmbietala(boolean muzicaAmbietala) {
    }
}
