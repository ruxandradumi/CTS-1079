package ro.ase.cts.state.classes;

public class StareOcupata implements StareMasa{

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata))
		{
			System.out.println("Masa cu numarul " + masa.getNumar() + " poate fi ocupata");
			masa.setStareMasa(this);
		}
		else
		{
			System.out.println("Masa a fost initial ocupata");
		}
	}
}
