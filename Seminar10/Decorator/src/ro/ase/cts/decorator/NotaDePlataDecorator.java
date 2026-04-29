package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlataAbstract;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlataAbstract) {
        this.notaDePlataAbstract = notaDePlataAbstract;
    }

    @Override
    public void printeaza() {
        notaDePlataAbstract.printeaza();
    }

    public abstract void printeazaFelicitare();


}
