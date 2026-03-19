package ro.ase.cts.clase;

public class InternareBuilder implements AbstractBuilder{

    private Internare internare;

    public InternareBuilder(String nume){
        internare = new Internare(nume, false, false, false, false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNumePacient(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.internare.setMicDejun(micDejun);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuci) {
        this.internare.setPapuciCamera(papuci);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean pat) {
        this.internare.setPatRabatabil(pat);
        return this;
    }
}
