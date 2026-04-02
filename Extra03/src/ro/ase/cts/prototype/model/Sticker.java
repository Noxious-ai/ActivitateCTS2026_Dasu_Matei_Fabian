package ro.ase.cts.prototype.model;

public class Sticker implements ISticker{
    protected Masina masina;
    protected int anFabricatieMasina;
    protected String denumireMasina;

    public Sticker() {
    }

    public Sticker(Masina masina) {
        this.masina = masina;
        this.anFabricatieMasina = masina.getAnFabricatie();
        this.denumireMasina = masina.getDenumire();
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
        this.anFabricatieMasina = masina.getAnFabricatie();
        this.denumireMasina = masina.getDenumire();
    }

    @Override
    public ISticker clone() {
        Sticker stickerNou = new Sticker();
        stickerNou.masina = new Masina(this.masina.getDenumire(), this.masina.getAnFabricatie());
        return stickerNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("masina=").append(masina);
        sb.append(", anFabricatieMasina=").append(anFabricatieMasina);
        sb.append(", denumireMasina='").append(denumireMasina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
