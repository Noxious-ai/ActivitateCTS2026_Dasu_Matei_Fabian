package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinii {
    Map<Integer, Linie> registru = new HashMap<>();

    public Linie getLinie(int numarLinie, String primaStatie, String ultimaStatie){
        if(registru.containsKey(numarLinie)){
            return registru.get(numarLinie);
        } else {
            Linie linieNoua = new Linie(numarLinie, primaStatie, ultimaStatie);
            registru.put(linieNoua.getNrLinie(), linieNoua);
            return linieNoua;
        }
    }
}
