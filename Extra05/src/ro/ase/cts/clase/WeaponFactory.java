package ro.ase.cts.clase;

public class WeaponFactory {

    public WeaponBuilder getBuilder(WeaponTypes weaponType) {
        switch (weaponType) {
            case GUN:
                return new GunBuilder();
            case KNIFE:
                return new KnifeBuilder();
            case PISTOL:
                return new PistolBuilder();
            default:
                throw new IllegalArgumentException("Tip arma invalid");
        }
    }
}
