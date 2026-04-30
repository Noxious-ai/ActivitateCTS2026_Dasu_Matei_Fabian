package ro.ase.cts.program;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.ManagerLinii;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Nou", 2000, 30);
        Autobuz autobuz2 = new Autobuz("Nou", 2010, 40);
        Autobuz autobuz3 = new Autobuz("Vechi", 1980, 25);

        ManagerLinii managerLinii = new ManagerLinii();


        managerLinii.getLinie(101, "Romana", "Universitate").numarMaximPasageriPeLinie(autobuz3);
        managerLinii.getLinie(101, "fhsfhf", "shasa").descrereLinie(autobuz2);
    }
}