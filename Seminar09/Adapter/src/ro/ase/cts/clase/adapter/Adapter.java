package ro.ase.cts.clase.adapter;

import ro.ase.cts.clase.spital.Medicament;

public class Adapter extends ro.ase.cts.clase.farmacie.Medicament{
    private ro.ase.cts.clase.spital.Medicament medicament;


    public Adapter(ro.ase.cts.clase.spital.Medicament medicament){
        super(medicament.getNume());
        this.medicament = medicament;
    }


}
