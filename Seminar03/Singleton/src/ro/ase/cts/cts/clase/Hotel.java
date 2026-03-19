package ro.ase.cts.cts.clase;

public class Hotel {
    private String nume;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance = null;

    private Hotel(String nume, int numarCamere, int numarCamereOcupate) {
        this.nume = nume;
        this.numarCamere = numarCamere;
        if (numarCamereOcupate > numarCamere){
            this.numarCamereOcupate = this.numarCamere;
        } else{
            this.numarCamereOcupate = numarCamereOcupate;
        }
    }

    public static synchronized Hotel getInstance(String nume, int numarCamere, int numarCamereOcupate){
        if (instance == null){
            instance = new Hotel(nume, numarCamere, numarCamereOcupate);
        }
        return instance;
    }

    public void rezeraCamera(){
        if(this.numarCamereOcupate < this.numarCamere){
            this.numarCamereOcupate += 1;
            System.out.println("Rezervarea a fost realizata");
        } else {
            System.out.println("Nu sunt camere disponibile, rezervare invalida!");
        }
    }

    public void elibereazaCamere(){
        if(this.numarCamereOcupate > 0){
            this.numarCamereOcupate -= 1;
            System.out.println("Eliberarea a fost realizata");
        } else {
            System.out.println("Toate camerele sunt libere!");
        }
    }

    public int calculeazaNumarCamereLibere(){
        return this.numarCamere - this.numarCamereOcupate;
    }

    public float calculeazaGradOcupare(){
        return (float) this.numarCamereOcupate / (float)this.numarCamere;
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hotelul ").append(this.nume).append(" are ").append(this.numarCamere);
        sb.append(" de camere.").append(" Dintre care sunt ocupate ").append(this.numarCamereOcupate).append('.');
        sb.append(" Camere libere: ").append(calculeazaNumarCamereLibere()).append('.');
        sb.append(" Grad ocupare: ").append(calculeazaGradOcupare());
        System.out.println(sb);
    }
}
