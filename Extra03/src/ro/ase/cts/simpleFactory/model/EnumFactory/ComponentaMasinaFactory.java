package ro.ase.cts.simpleFactory.model.EnumFactory;

import ro.ase.cts.simpleFactory.model.clase.Bara;
import ro.ase.cts.simpleFactory.model.clase.IComponenta;
import ro.ase.cts.simpleFactory.model.clase.Portbagaj;
import ro.ase.cts.simpleFactory.model.clase.Usa;

public class ComponentaMasinaFactory {
    public ComponentaMasinaFactory() {
    }

    public IComponenta getComponenetaMasina(TipComponentaMasina tipComponentaMasina, String denumire, String culoare){
        if (tipComponentaMasina == TipComponentaMasina.BARA){
            return new Bara(denumire, culoare);
        }
        else if(tipComponentaMasina == TipComponentaMasina.PORTBAGAJ){
            return new Portbagaj(denumire, culoare);
        }
        else if(tipComponentaMasina == TipComponentaMasina.USA){
            return new Usa(denumire, culoare);
        }
        else
            return null;
    }
}
