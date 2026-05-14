package ro.ase.cts.clase;

public class CalatorAbonat implements Calator{
    private String nume;
    private float sold;

    public void platesteBilet(float pret){
        if(this.sold >= pret){
            System.out.println(this.nume + " plateste " + pret + " pt o calatorie");
            sold -= pret;
        } else {
            System.out.println("Sold insuficient, mergeti pe jos");
        }
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public float getSold() {
        return sold;
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifcare(String linie, String mesaj) {
        System.out.println(this.nume + " " + mesaj);
    }
}
