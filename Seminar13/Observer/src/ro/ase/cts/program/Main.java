package ro.ase.cts.program;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Calator c = new CalatorAbonat("Dasu hater");
        Calator c1 = new CalatorAbonat("Rares sugaci");
        Calator c2 = new CalatorAbonat("Bogdanel");
        Calator c3 = new CalatorAbonat("Ratatata");

        MijlocDeTransport autobuz = new Autobuz("335");

        autobuz.aboneazaLaPlecare(c);
        autobuz.aboneazaLaPlecare(c1);
        autobuz.aboneazaLaPlecare(c2);

        autobuz.pleaceDinDepou();


        autobuz.dezAboneazaLaPlecare(c1);
        autobuz.aboneazaLaPlecare(c3);

        autobuz.ramaneBlocatInTrafic();
    }
}