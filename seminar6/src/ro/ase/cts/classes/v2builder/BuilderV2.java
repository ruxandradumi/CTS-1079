package ro.ase.cts.classes.v2builder;

public class BuilderV2 implements IBuilder{

    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbietala;
    private String genMuzica;
    private int codRezervare;

    public BuilderV2() {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacoritoare = false;
        this.muzicaAmbietala = false;
        this.genMuzica = "";
        this.codRezervare = 0;
    }

    public BuilderV2(int codRezervare) {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacoritoare = false;
        this.muzicaAmbietala = false;
        this.genMuzica = "";
        this.codRezervare = codRezervare;
    }

    public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public BuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public BuilderV2 setMuzicaAmbietala(boolean muzicaAmbietala) {
        this.muzicaAmbietala = muzicaAmbietala;
        return this;
    }

    public BuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public BuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    @Override
    public Rezervare build() {
        Rezervare rezervare = new Rezervare(mancareInclusa, scaunErgonomic, bauturaRacoritoare,
                muzicaAmbietala, genMuzica, codRezervare);
        return rezervare;
    }

}
