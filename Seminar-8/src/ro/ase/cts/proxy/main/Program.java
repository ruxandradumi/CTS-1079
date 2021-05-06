package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.classes.IRezervare;
import ro.ase.cts.proxy.classes.ProxyRezervare;
import ro.ase.cts.proxy.classes.Rezervare;

public class Program {
    public static void main(String[] args) {
        IRezervare rezervarePentruDouaPersoae= new Rezervare(3,2);
        rezervarePentruDouaPersoae.rezerva();

        IRezervare proxyRezervare=new ProxyRezervare((Rezervare) rezervarePentruDouaPersoae);
        proxyRezervare.rezerva();

        (((Rezervare) rezervarePentruDouaPersoae)).setNrPersoane(4);
        proxyRezervare.rezerva();
    }
}