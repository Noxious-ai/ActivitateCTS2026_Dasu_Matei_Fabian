package ro.ase.cts.main;


import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rez1 = new Rezervare("Gica", 21, 15, "0723232323");
        RezervareAbstracta rez2 = rez1.clone();

        ((Rezervare)rez2).setOraRezervare(18);
        ((Rezervare)rez2).setZi(5);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }


}