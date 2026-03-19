package ro.ase.cts.main;


import ro.ase.cts.clase.AbstractBuilder;
import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new InternareBuilder();
        Internare internare5 = builder.build("Gigel");
        Internare internare6 = builder.build("Georgel");

//        internare5.setHalat(true);
    }
}