package ro.ase.cts.readere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;

public class StudentReader extends AplicantReader{
	
	
	public StudentReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> students = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			String nume = input.next();
			String prenume = (input.next()).toString();
			int varsta = Integer.valueOf(input.nextInt());
			int punctaj = Integer.valueOf(input.nextInt());
			int nr = Integer.valueOf(input.nextInt());
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input.next();
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
			students.add(s);
		}
		input.close();
		return students;
	}
}
