package ro.ase.cts.classes.v1builder.main;

import ro.ase.cts.classes.v1builder.Builder;
import ro.ase.cts.classes.v1builder.Rezervare;

public class Program {

    public static void main(String[] args) {
        Rezervare rezervare1 = new Builder().setBauturaRacoritoare(true).setCodRezervare(2).setMancareInclusa(true).build();
        Rezervare rezervare2 = new Builder().setCodRezervare(3).setMuzicaAmbietala(true).setGenMuzica("folk").build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }

}