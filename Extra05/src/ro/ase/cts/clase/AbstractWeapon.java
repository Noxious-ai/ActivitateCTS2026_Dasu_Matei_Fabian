package ro.ase.cts.clase;

public abstract class AbstractWeapon {
    private String name;
    private int damage;

    protected AbstractWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "name='" + name + "', damage=" + damage;
    }
}
