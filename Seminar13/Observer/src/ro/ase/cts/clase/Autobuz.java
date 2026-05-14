package ro.ase.cts.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleaceDinDepou() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " pleaca pe traseu";
        for(Calator c: listaCalatori){
            c.notifcare(super.linie, mesaj);
        }
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " este blocat in trafic";
        for(Calator c: listaCalatori){
            c.notifcare(super.linie, mesaj);
        }
    }
}
