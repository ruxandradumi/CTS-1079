package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.Client;

public class Program {
    public static void main(String[] args){
        Client client1=new Client(100, "Mihai",18);
        Client cleint2=(Client) client1.copiaza();
    }
}
