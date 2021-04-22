package ro.ase.cts.stateV2.classes;

public class Masa {
	private int numarMasa;
	private Stare stare;
	
	public Masa(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
		this.stare = new StareLibera();
	}
	
	public void elibereazaMasa()
	{
		if(!(stare instanceof StareLibera))
		{
			System.out.println("Masa cu numarul " + numarMasa + " a fost eliberata");
			stare = new StareLibera();
		}
		else {
			System.out.println("Masa cu numarul " + numarMasa + " este libera");
		}
	}
	
	public void rezervaMasa()
	{
		if(stare instanceof StareLibera)
		{
			System.out.println("Masa cu numarul " + numarMasa + " a fost rezervata");
			stare = new StareRezervata();
		}
		else {
			System.out.println("Masa cu numarul " + numarMasa + " nu poate fi rezervata");
		}
	}
	
	public void ocupaMasa()
	{
		if(!(stare instanceof StareOcupata))
		{
			System.out.println("Masa cu numarul " + numarMasa + " a fost ocupata");
			stare =  new StareOcupata();
		}
		else {
			System.out.println("Masa cu numarul " + numarMasa + " nu poate fi ocupata");
		}
	}
	
}
