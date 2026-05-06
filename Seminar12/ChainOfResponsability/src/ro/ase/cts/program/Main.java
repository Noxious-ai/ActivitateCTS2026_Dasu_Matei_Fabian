package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5.3));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2.3));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4.3));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12.3));

    }
}