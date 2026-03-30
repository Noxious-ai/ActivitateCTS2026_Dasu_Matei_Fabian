package ro.ase.cts.main;


import ro.ase.cts.clase.AbstractBuilder;
import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
//        internare1.setNumePacient("Silviu");
//        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
//        internare2.setNumePacient("George");
//        internare2.setPatRabatabil(true);


        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare internare3 = builder.setPatRabatabil(true).setNumePacient("Muie").build();
        Internare internare4 = new InternareBuilder("Andrei").setArePapuci(true).build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());
    }
}