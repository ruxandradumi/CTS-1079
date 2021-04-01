package ro.ase.cts.classes.v1builder;

public class Builder implements IBuilder{
    private Rezervare rezervare;

    public Builder() {
        rezervare = new Rezervare(false, false, false, false, "gen", 1);
    }

    public Builder setMancareInclusa(boolean mancareInclusa) {
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public Builder setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        rezervare.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }

    public Builder setMuzicaAmbietala(boolean muzicaAmbietala) {
        rezervare.setMuzicaAmbietala(muzicaAmbietala);
        return this;
    }

    public Builder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public Builder setCodRezervare(int codRezervare) {
        rezervare.setCodRezervare(codRezervare);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
