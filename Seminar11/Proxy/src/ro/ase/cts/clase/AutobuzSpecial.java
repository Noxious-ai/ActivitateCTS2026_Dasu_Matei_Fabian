package ro.ase.cts.clase;

public class AutobuzSpecial implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;
    private int numarPasageri;
    private int numariLinie;
    private TipCursa tipCursa = TipCursa.CURSA_SPECIALA;


    public AutobuzSpecial(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
        this.numariLinie = mijlocDeTransport.getNumarLinie();
        this.numarPasageri = 0;
    }

    @Override
    public void opresteInStatie(StatieAutobuz statieAutobuz) {
        if(this.getTipCursa() == TipCursa.CURSA_SPECIALA ){
            System.out.println("Autobuzul de pe linia " + this.getNumarLinie() + " nu circula pe ruta obisnuita si nu opreste in " + statieAutobuz.getNume());
        } else {
            this.mijlocDeTransport.opresteInStatie(statieAutobuz);
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
        return this.tipCursa;
    }
}
