package ro.ase.cts.clase;

public class GunBuilder extends WeaponBuilder {
    private int ammoCapacity;

    public GunBuilder() {
        super();
        this.name = "Default Gun";
        this.damage = 50;
        this.ammoCapacity = 30;
    }

    public GunBuilder setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
        return this;
    }

    @Override
    public GunBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public GunBuilder setDamage(int damage) {
        super.setDamage(damage);
        return this;
    }

    @Override
    public AbstractWeapon build() {
        return new Gun(name, damage, ammoCapacity);
    }
}
