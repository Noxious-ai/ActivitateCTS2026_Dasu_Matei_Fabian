package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    protected String linie;
    protected List<Calator> listaCalatori;

    public MijlocDeTransport(String linie) {
        this.linie = linie;
        listaCalatori = new ArrayList<>();
    }

    public abstract void pleaceDinDepou();

    public abstract void ramaneBlocatInTrafic();

    public void aboneazaLaPlecare(Calator calator){
        listaCalatori.add(calator);
    }


    public void dezAboneazaLaPlecare(Calator calator){
        listaCalatori.remove(calator);
    }

}
