package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> Structuri;


    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.Structuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        Structuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        Structuri.remove(structura);
    }

    public Structura getStructura(int index){
        return Structuri.get(index);
    }



    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + " Nume departament: " + this.numeDepartament);
        for(Structura s : Structuri){
            s.afiseazaDetaliiStructura(spatii);
        }
    }
}
