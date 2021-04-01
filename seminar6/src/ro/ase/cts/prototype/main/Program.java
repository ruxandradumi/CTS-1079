package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.Bilet;
import ro.ase.cts.prototype.Client;

public class Program {
    public static void main(String[] args){
        Client client1=new Client(100, "Mihai",18);
        Client client2=(Client) client1.copiaza();

        System.out.println(client1);
        System.out.println(client2);

        Bilet bilet1=new Bilet(0,"echipa 1", "echipa2", "25.04.2021");
        Bilet bilet2=(Bilet) bilet1.copiaza();
        bilet2.setCod(1);
        Bilet bilet3=(Bilet)  bilet1.copiaza();
        bilet2.setCod(2);

        System.out.println(bilet2.toString());
        System.out.println(bilet3.toString());

    }
}
