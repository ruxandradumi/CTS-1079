package ro.ase.cts.state.main;

import ro.ase.cts.state.classes.Masa;
import ro.ase.cts.state.classes.StareLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		masa.rezervaMasa();

		masa.ocupaMasa();
		
		masa.ocupaMasa();
		
		masa.elibereazaMasa();
	}
}
