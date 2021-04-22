package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.classes.Card;
import ro.ase.cts.strategy.classes.Cash;
import ro.ase.cts.strategy.classes.Client;

public class Program {

	public static void main(String[] args) {
		Client client =  new Client("Popescu");
		client.setModPlata(new Cash());
		client.platesteNota(200);
		
		client.setModPlata(new Card(500));
		client.platesteNota(350);
		client.platesteNota(200);
	}
}
