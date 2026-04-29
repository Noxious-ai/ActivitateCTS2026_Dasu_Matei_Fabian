package ro.ase.cts.program;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSptial = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 3);
        Structura sectieManagement = new Sectie("Management", 5);


        ((Departament) depSptial).adaugaStructura(depAdministrativ);
        ((Departament) depSptial).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSptial.afiseazaDetaliiStructura(" ");

        ((Departament) depSptial).stergeStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);

        depSptial.afiseazaDetaliiStructura("       ");



    }
}