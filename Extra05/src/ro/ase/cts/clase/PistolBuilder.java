package ro.ase.cts.clase;

public class PistolBuilder extends WeaponBuilder {
    private boolean hasSilencer;

    public PistolBuilder() {
        super();
        this.name = "Default Pistol";
        this.damage = 35;
        this.hasSilencer = false;
    }

    public PistolBuilder setHasSilencer(boolean hasSilencer) {
        this.hasSilencer = hasSilencer;
        return this;
    }

    @Override
    public PistolBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public PistolBuilder setDamage(int damage) {
        super.setDamage(damage);
        return this;
    }

    @Override
    public AbstractWeapon build() {
        return new Pistol(name, damage, hasSilencer);
    }
}
