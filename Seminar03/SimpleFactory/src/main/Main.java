package main;

import FactoryEnum.Depou;
import FactoryEnum.TipuriMijloaceTransport;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Depou depou =  Depou.getInstance();
        MijlocTransport autobuz = depou.getMijlocDeTransport(TipuriMijloaceTransport.AUTOBUZ, 8, "B666XXX");
        MijlocTransport troleibuz = depou.getMijlocDeTransport(TipuriMijloaceTransport.TROLEIBUZ, 10, "B555YYY");
        MijlocTransport tramvai = depou.getMijlocDeTransport(TipuriMijloaceTransport.TRAMVAI, 10, "B888ZZZ");

        depou.afiseazaNumarVehicule();

        Depou depou1 = Depou.getInstance();

        MijlocTransport autobuz2 = depou.getMijlocDeTransport(TipuriMijloaceTransport.AUTOBUZ, 10, "TM111AAA");

        depou.afiseazaNumarVehicule();

    }
}