package ro.ase.cts.simple.factory.clase;

import ro.ase.cts.singleton.clase.AMasina;
import ro.ase.cts.singleton.clase.Masina;

public class MasinaFactory {
    public AMasina creeazaMasina(TipMasina tipMasina, int an, String marca){
        return switch (tipMasina){
            case SUV -> new Suv(an, marca);
            case VAN -> new Van(an, marca);
            case SEDAN -> new Sedan(an, marca);
            default -> null;
        };

    }
}
