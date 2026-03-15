package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatReader;
import ro.ase.cts.clase.readere.AplicantReader;

public class Program {

	public static void main(String[] args) {
		Angajat.setValoareFinantareAngajat(50);
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatReader = new AngajatReader("angajati.txt");
			listaAngajati = angajatReader.readAplicant();
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afiseazaFinantare();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
