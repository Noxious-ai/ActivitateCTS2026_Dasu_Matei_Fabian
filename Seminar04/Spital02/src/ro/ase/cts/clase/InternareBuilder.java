package ro.ase.cts.clase;

public class InternareBuilder implements AbstractBuilder{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;
    private Internare internare;

    public InternareBuilder(){
        internare = new Internare();
    }

    @Override
    public Internare build(String nume) {
        return new Internare(patRabatabil, micDejun, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder setNumePacient(String numePacient) {
        return null;
    }


    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuci) {
        this.papuciCamera = papuci;
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean pat) {
        this.patRabatabil = pat;
        return this;
    }
}
