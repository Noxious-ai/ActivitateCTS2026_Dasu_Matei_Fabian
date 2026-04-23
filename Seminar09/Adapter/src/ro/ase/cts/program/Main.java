package ro.ase.cts.program;

import ro.ase.cts.clase.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;


public class Main {

    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medFarmacie){
        medFarmacie.achizitiiMedicament();
    }

    public static void main(String[] args) {

        Medicament med = new Medicament("Paracetomol");
        ro.ase.cts.clase.farmacie.Medicament med1 = new ro.ase.cts.clase.farmacie.Medicament("Nurofen");

        med.achizitiiMedicament();
        med1.achizitiiMedicament();


        Adapter adapterMedicament = new Adapter(med);

        procurareMedicament(adapterMedicament);

    }
}
