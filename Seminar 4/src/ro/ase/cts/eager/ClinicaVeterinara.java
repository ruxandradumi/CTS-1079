package ro.ase.cts.eager;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	// la eager initialisation, instanta este initializata la momentul declarari
	private static final ClinicaVeterinara clinicaVeterinara = new ClinicaVeterinara("Clinica Vet", "Strada Dorobanti",
			5, 3664.76f);

	// Constructorul trb sa fie private!
	private ClinicaVeterinara(String nume, String adresa, int nrMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}

	// functia stataica publica care va returna instanta
	public static ClinicaVeterinara getInstance() {
		return clinicaVeterinara;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNrMedici() {
		return nrMedici;
	}

	public void setNrMedici(int nrMedici) {
		this.nrMedici = nrMedici;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", nrMedici=" + nrMedici + ", buget=" + buget
				+ "]";
	}

}
