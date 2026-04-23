package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;


    public Medicament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void achizitiiMedicament(){
        if (this.prezintaReteta()){
            System.out.printf("Medicamentul %s a fost achizitionat!%n", this.nume);
        }else{
            System.out.println("Nu se poate achizitiona medicamentul");
        }
    }

    public boolean prezintaReteta(){
        return this.nume.length() > 10;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
