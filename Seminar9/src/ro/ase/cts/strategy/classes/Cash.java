package ro.ase.cts.strategy.classes;

public class Cash implements ModPlata{

	@Override
	public void plateste(double suma) {
		System.out.println("Se plateste cash suma de " + suma);
	}
}
