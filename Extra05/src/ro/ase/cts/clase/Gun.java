package ro.ase.cts.clase;

public class Gun extends AbstractWeapon {
    private int ammoCapacity;

    protected Gun(String name, int damage, int ammoCapacity) {
        super(name, damage);
        this.ammoCapacity = ammoCapacity;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    @Override
    public String toString() {
        return "Gun{" + super.toString() + ", ammoCapacity=" + ammoCapacity + "}";
    }
}
