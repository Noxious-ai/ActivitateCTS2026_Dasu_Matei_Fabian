package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.model.EnumFactory.ComponentaMasinaFactory;
import ro.ase.cts.simpleFactory.model.EnumFactory.TipComponentaMasina;
import ro.ase.cts.simpleFactory.model.clase.IComponenta;

public class Main {
    public static void main(String[] args) {
        ComponentaMasinaFactory componentaMasinaFactory = new ComponentaMasinaFactory();
        IComponenta usa = componentaMasinaFactory.getComponenetaMasina(TipComponentaMasina.USA, "Usa Stanga Spate", "Verde");
        IComponenta portbagaj = componentaMasinaFactory.getComponenetaMasina(TipComponentaMasina.PORTBAGAJ, "Portbagaj", "albastru");
        IComponenta bara = componentaMasinaFactory.getComponenetaMasina(TipComponentaMasina.BARA, "Bara spate", "Negru");

        System.out.println(usa.toString());
        System.out.println(bara.toString());
        System.out.println(portbagaj.toString());
    }
}
