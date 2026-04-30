package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private int numarPasageri;
    private int numarLinie;
    private TipCursa tipCursa;
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
        this.numarPasageri = this.mijlocDeTransport.getNumarPasageri();
        this.numarLinie = this.mijlocDeTransport.getNumarLinie();
        this.tipCursa = this.mijlocDeTransport.getTipCursa();
    }



    @Override
    public void opresteInStatie(StatieAutobuz statieAutobuz) {
        if(statieAutobuz.getNumarPersoane() > 0 || this.mijlocDeTransport.getNumarPasageri() > 0){
            this.mijlocDeTransport.opresteInStatie(statieAutobuz);
        } else {
            System.out.println("Autobuzul de noapte de pe linia " + this.numarLinie + " nu a oprint in statia " + statieAutobuz.getNume());
        }
    }

    @Override
    public int getNumarPasageri() {
        return this.mijlocDeTransport.getNumarPasageri();
    }

    @Override
    public int getNumarLinie() {
        return this.mijlocDeTransport.getNumarLinie();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
