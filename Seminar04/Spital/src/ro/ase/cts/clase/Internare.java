package ro.ase.cts.clase;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public Internare() {
        this.numePacient = "Ion";
        this.halat = false;
        this.papuciCamera = false;
        this.micDejun = false;
        this.patRabatabil = false;
    }

    public Internare(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halat = halat;
    }


    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    protected void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    protected void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
