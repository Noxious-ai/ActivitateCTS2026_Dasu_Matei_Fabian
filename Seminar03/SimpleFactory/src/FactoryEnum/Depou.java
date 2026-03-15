package FactoryEnum;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.Tramvai;
import clase.Troleibuz;

public class Depou {
    private static Depou instance = null;
    private int numarVehicule = 0;

    private Depou(){
    }

    public static synchronized Depou getInstance(){
        if(instance == null){
            instance = new Depou();
        }
        return instance;
    }

    public MijlocTransport getMijlocDeTransport(TipuriMijloaceTransport tip, int numarRoti, String numarInmatriculare){
        MijlocTransport mijloc = null;

        if (tip == TipuriMijloaceTransport.TRAMVAI){
            mijloc = new Tramvai(numarRoti, numarInmatriculare);
        } else if (tip == TipuriMijloaceTransport.TROLEIBUZ) {
            mijloc = new Troleibuz(numarRoti, numarInmatriculare);
        } else if (tip == TipuriMijloaceTransport.AUTOBUZ) {
            mijloc = new Autobuz(numarRoti, numarInmatriculare);
        }
        if (mijloc != null){
            numarVehicule++;
        }

        return mijloc;
    }

    public void afiseazaNumarVehicule(){
        System.out.println("Numarul de vehicule creeat este: " + numarVehicule);
    }
}
