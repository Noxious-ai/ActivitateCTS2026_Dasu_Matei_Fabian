package ro.ase.cts.clase;

public class Pistol extends AbstractWeapon {
    private boolean hasSilencer;

    protected Pistol(String name, int damage, boolean hasSilencer) {
        super(name, damage);
        this.hasSilencer = hasSilencer;
    }

    public boolean hasSilencer() {
        return hasSilencer;
    }

    public void setHasSilencer(boolean hasSilencer) {
        this.hasSilencer = hasSilencer;
    }

    @Override
    public String toString() {
        return "Pistol{" + super.toString() + ", hasSilencer=" + hasSilencer + "}";
    }
}
