package ro.ase.cts.clase;

public class Knife extends AbstractWeapon {
    private double bladeLength;

    protected Knife(String name, int damage, double bladeLength) {
        super(name, damage);
        this.bladeLength = bladeLength;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    @Override
    public String toString() {
        return "Knife{" + super.toString() + ", bladeLength=" + bladeLength + "}";
    }
}
