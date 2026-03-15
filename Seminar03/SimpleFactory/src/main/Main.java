package main;

import FactoryEnum.Depou;
import FactoryEnum.TipuriMijloaceTransport;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocDeTransport(TipuriMijloaceTransport.AUTOBUZ, 8, "B666XXX");
        MijlocTransport troleibuz = depou.getMijlocDeTransport(TipuriMijloaceTransport.TROLEIBUZ, 10, "B555YYY");
        MijlocTransport tramvai = depou.getMijlocDeTransport(TipuriMijloaceTransport.TRAMVAI, 10, "B888ZZZ");
    }
}