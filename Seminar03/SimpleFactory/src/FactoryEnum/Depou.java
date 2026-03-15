package FactoryEnum;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.Tramvai;
import clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocDeTransport(TipuriMijloaceTransport tip, int numarRoti, String numarInmatriculare){
        if (tip == TipuriMijloaceTransport.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        } else if (tip == TipuriMijloaceTransport.TROLEIBUZ) {
            return new Troleibuz(numarRoti, numarInmatriculare);
        } else if (tip == TipuriMijloaceTransport.AUTOBUZ) {
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
