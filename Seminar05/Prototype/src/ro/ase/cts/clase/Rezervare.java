package ro.ase.cts.clase;

public class Rezervare implements RezervareAbstracta {
    private String numeClient;
    private int oraRezervare;
    private int zi;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int zi, String numarTelefon) {
        this.numeClient = numeClient;

        if(this.numeClient.length() < 3){
            this.numeClient = "Ion";
        }

        if(oraRezervare > 23 || oraRezervare < 8) {
            this.oraRezervare = 21;
        } else{
            this.oraRezervare = oraRezervare;
        }

        if(zi < 1 || zi > 31){
            this.zi = 1;
        } else{
            this.zi = zi;
        }

        if(numarTelefon.length() != 10){
            this.numarTelefon = "0723456789";
        } else{
            this.numarTelefon = numarTelefon;

        }
    }

    private Rezervare() {
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;
        rezervareNoua.zi = this.zi;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", zi=").append(zi);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare > 23 || oraRezervare < 8) {
            this.oraRezervare = 21;
        } else{
            this.oraRezervare = oraRezervare;
        }
    }

    public void setZi(int zi) {
        if(zi < 1 || zi > 31){
            this.zi = 1;
        } else{
            this.zi = zi;
        }
    }
}
