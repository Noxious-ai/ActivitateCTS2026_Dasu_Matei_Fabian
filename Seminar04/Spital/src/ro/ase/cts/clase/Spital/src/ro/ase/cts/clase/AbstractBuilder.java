package ro.ase.cts.clase.Spital.src.ro.ase.cts.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setAreMicDejun(boolean micDejun);
    AbstractBuilder setAreHalat(boolean halat);
    AbstractBuilder setArePapuci(boolean papuci);
    AbstractBuilder setPatRabatabil(boolean pat);


}
