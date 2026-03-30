package ro.ase.cts.singleton.clase;

import java.util.ArrayList;
import java.util.List;

public class Service implements IService{
    String nume;
    int stele;
    Masina masina = null;

    private static Service instance = null;

    List<Masina> listaMasini= new ArrayList();

    private Service(String nume, int stele) {
        this.nume = nume;
        this.stele = stele;
    }


    @Override
    public void afiseaza() {
        for(Masina m: listaMasini){
            System.out.println(m.toString());
        }
    }

    @Override
    public void addMasina(Masina masina) {
        this.listaMasini.add(masina);
    }

    public static synchronized Service getInstance(String nume, int stele) {
        if (instance == null){
            instance = new Service(nume, stele);
        }
        return instance;
    }
}
