package ro.ase.cts.program;


import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        operator.adaugaComanda(new Plecare(new Autobuz("Mercedes"), 335));
        operator.adaugaComanda(new Plecare(new Autobuz("Audi"), 224));
        operator.adaugaComanda(new Plecare(new Autobuz("Mercedes"), 301));


        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}