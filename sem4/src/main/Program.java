package main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.eager.ClinicaVeterinaraLazy;

public class   Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1=ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2=ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy clinica3=ClinicaVeterinaraLazy.getInstance("ClinVet", "Str. Independentei", 4, 4500.45f);
		ClinicaVeterinaraLazy clinica4=ClinicaVeterinaraLazy.getInstance("VetClin", "Str. Libertatii", 5, 2500.45f);
	
	    System.out.println(clinica3.toString());
		System.out.println(clinica4.toString());
		
		clinica3.setNume("Clinica 1");
		clinica4.setNrMedici(7);
		System.out.println(clinica3.toString());
		System.out.println(clinica4.toString());
	}

}
