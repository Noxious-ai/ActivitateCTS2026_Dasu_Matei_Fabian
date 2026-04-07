package ro.ase.cts.clase;

public abstract class WeaponBuilder implements AbstractBuilder {
    protected String name;
    protected int damage;

    protected WeaponBuilder() {
        this.name = "Default weapon";
        this.damage = 0;
    }

    public WeaponBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public WeaponBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }
}
