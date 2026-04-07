package ro.ase.cts.clase;

public class KnifeBuilder extends WeaponBuilder {
    private double bladeLength;

    public KnifeBuilder() {
        super();
        this.name = "Default Knife";
        this.damage = 20;
        this.bladeLength = 10.0;
    }

    public KnifeBuilder setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
        return this;
    }

    @Override
    public KnifeBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public KnifeBuilder setDamage(int damage) {
        super.setDamage(damage);
        return this;
    }

    @Override
    public AbstractWeapon build() {
        return new Knife(name, damage, bladeLength);
    }
}
