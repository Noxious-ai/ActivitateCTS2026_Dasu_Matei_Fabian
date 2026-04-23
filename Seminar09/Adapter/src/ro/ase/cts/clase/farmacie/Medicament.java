package ro.ase.cts.clase.farmacie;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void achizitiiMedicament(){
            System.out.printf("Medicamentul %s a fost achizitionat!%n", this.nume);
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
