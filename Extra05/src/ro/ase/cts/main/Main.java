package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        WeaponFactory factory = new WeaponFactory();

        GunBuilder gunBuilder = (GunBuilder) factory.getBuilder(WeaponTypes.GUN);
        AbstractWeapon gun = gunBuilder
                .setName("AK-47")
                .setDamage(100)
                .setAmmoCapacity(45)
                .build();

        KnifeBuilder knifeBuilder = (KnifeBuilder) factory.getBuilder(WeaponTypes.KNIFE);
        AbstractWeapon knife = knifeBuilder
                .setName("Karambit")
                .setDamage(40)
                .setBladeLength(15.5)
                .build();

        PistolBuilder pistolBuilder = (PistolBuilder) factory.getBuilder(WeaponTypes.PISTOL);
        AbstractWeapon pistol = pistolBuilder
                .setName("Glock")
                .setDamage(55)
                .setHasSilencer(true)
                .build();

        System.out.println(gun);
        System.out.println(knife);
        System.out.println(pistol);
    }
}
