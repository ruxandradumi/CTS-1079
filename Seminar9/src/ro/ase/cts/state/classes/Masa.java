package ro.ase.cts.state.classes;

public class Masa {
	private StareMasa stareMasa;
	private int numar;
	public Masa(int numar) {
		super();
		this.numar = numar;
		stareMasa = new StareLibera();
	}
	public StareMasa getStareMasa() {
		return stareMasa;
	}
	void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	
	public void rezervaMasa()
	{
		modificaStareMasa(new StareRezervata());
	}
	
	public void ocupaMasa()
	{
		modificaStareMasa(new StareOcupata());
	}
	
	public void elibereazaMasa()
	{
		modificaStareMasa(new StareLibera());
	}
	
	public void modificaStareMasa(StareMasa stare)
	{
		stare.schimbaStare(this);
	}
}
