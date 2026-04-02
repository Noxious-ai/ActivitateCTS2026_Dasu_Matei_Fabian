package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.model.ISticker;
import ro.ase.cts.prototype.model.Masina;
import ro.ase.cts.prototype.model.Sticker;

public class Main {
    public static void main(String[] args) {
        Masina m1 = new Masina("Toyota", 2010);
        ISticker s1 = new Sticker(m1);
        ISticker s2 = s1.clone();

        Masina m2 = new Masina("BMW", 2020);

        ((Sticker)s2).setMasina(m2);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}