package ro.ase.cts.strategy.classes;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		modPlata = new Cash();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(double suma)
	{
		System.out.println(nume + " trebuie sa realizeze o plata");
		modPlata.plateste(suma);
	}
	
	
}
