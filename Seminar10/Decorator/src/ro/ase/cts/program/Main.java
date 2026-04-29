package ro.ase.cts.program;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataPrintat1Mai;
import ro.ase.cts.decorator.NotaDePlataPrintatNoulAn;

public class Main {
    public static void main(String[] args) {
        int a = 2;

        NotaDePlataAbstract nota1 = new NotaDePlata("04/10/2026", 250f);
        NotaDePlataAbstract nota2 = new NotaDePlata("01/05/2026", 120.5f);

        //        nota1.printeaza();
        if (a == 1){
            NotaDePlataDecorator notaDePlataDecorator = new NotaDePlataPrintatNoulAn(nota1);
            notaDePlataDecorator.printeaza();
            notaDePlataDecorator.printeazaFelicitare();
        } else if(a == 2){
            NotaDePlataDecorator notaDePlataDecorator = new NotaDePlataPrintat1Mai(nota2);
            notaDePlataDecorator.printeaza();
            notaDePlataDecorator.printeazaFelicitare();

        }

    }
}