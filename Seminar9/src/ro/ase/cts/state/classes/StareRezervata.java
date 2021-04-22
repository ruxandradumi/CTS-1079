package ro.ase.cts.state.classes;

public class StareRezervata implements StareMasa{
	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera)
		{
			System.out.println("Ati rezervat masa cu numarul " + masa.getNumar());
			masa.setStareMasa(this);
		}
		else
		{
			System.out.println("Masa nu este disponibila");
		}
	}
}
