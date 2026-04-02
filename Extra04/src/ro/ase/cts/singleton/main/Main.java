package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.SingletonLicentaTurism;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonLicentaTurism l3 = SingletonLicentaTurism.getInstance("Ciocodos");
                l3.afiseazaDetalii();
            }
        });

        thread.start();

        SingletonLicentaTurism l1 = SingletonLicentaTurism.getInstance("Muie");
        SingletonLicentaTurism l2 = SingletonLicentaTurism.getInstance("Carici");




        l1.afiseazaDetalii();
        l2.afiseazaDetalii();

    }
}