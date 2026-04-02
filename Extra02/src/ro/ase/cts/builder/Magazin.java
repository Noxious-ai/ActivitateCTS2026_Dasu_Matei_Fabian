package ro.ase.cts.builder;

public class Magazin {
    private int numarIntrari;
    private int duritatePodea;
    private String denumire;

    private Magazin() {
        this.numarIntrari = 1;
        this.duritatePodea = 1;
        this.denumire = "";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("numarIntrari=").append(numarIntrari);
        sb.append(", duritatePodea=").append(duritatePodea);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public static class MagazinBuilder implements AbstractMagazinBuilder{
        private int numarIntrari;
        private int duritatePodea;
        private String denumire;
        private Magazin magazin;


        public MagazinBuilder() {
            this.magazin = new Magazin();
        }

        @Override
        public Magazin build() {
            return this.magazin;
        }

        @Override
        public AbstractMagazinBuilder setNumarIntrari(int numarIntrari) {
            this.magazin.numarIntrari = numarIntrari;
            return this;
        }

        @Override
        public AbstractMagazinBuilder setDuritatePodea(int duritatePodea) {
            this.magazin.duritatePodea = duritatePodea;
            return this;
        }

        @Override
        public AbstractMagazinBuilder setDenumire(String denumire) {
            this.magazin.denumire = denumire;
            return this;
        }
    }
}
