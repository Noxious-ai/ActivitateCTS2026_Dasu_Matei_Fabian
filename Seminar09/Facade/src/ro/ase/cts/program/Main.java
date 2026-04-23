package ro.ase.cts.program;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel", 5);
        Pacient pacient1 = new Pacient("Goe", 9);
        Pacient pacient2 = new Pacient("Georhescu", 6);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if(medic.areTrimitere(pacient)){
            int patLiber = salon.getPatLiber();
            if(patLiber > -1){
                System.out.println("Pacientul" + pacient.getNume() + " va fi internat in patul " + salon.getPatLiber());
                salon.ocupaPat(patLiber);
            } else {
                System.out.println("Nu avem paturi libere. Vei fi internat in alt salon");
            }
        } else{
            System.out.println("Ai nevoie de trimitere de la medic");
        }

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);

        receptieSpital.interneazaSpital(pacient1);
        receptieSpital.interneazaSpital(pacient2);

    }
}