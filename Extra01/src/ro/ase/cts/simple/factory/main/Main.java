package ro.ase.cts.simple.factory.main;

import ro.ase.cts.simple.factory.clase.MasinaFactory;
import ro.ase.cts.simple.factory.clase.Sedan;
import ro.ase.cts.simple.factory.clase.TipMasina;
import ro.ase.cts.singleton.clase.AMasina;
import ro.ase.cts.singleton.clase.Masina;

public class Main {
    public static void main(String[] args) {
        MasinaFactory factory = new MasinaFactory();

        AMasina m1 = factory.creeazaMasina(TipMasina.SEDAN, 3, "Toyota");
        AMasina m2 = factory.creeazaMasina(TipMasina.SUV, 5, "Nissan");
        AMasina m3 = factory.creeazaMasina(TipMasina.VAN, 10, "Dacia");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
