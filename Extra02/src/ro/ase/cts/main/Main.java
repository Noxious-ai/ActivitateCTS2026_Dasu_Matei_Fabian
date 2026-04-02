package ro.ase.cts.main;

import ro.ase.cts.builder.AbstractMagazinBuilder;
import ro.ase.cts.builder.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin.MagazinBuilder().setDenumire("New Yorker").build();
        System.out.println(magazin.toString());

        Magazin magazin2 = new Magazin.MagazinBuilder().setDuritatePodea(5).setDenumire("H & M").build();
        System.out.println(magazin2);
    }
}