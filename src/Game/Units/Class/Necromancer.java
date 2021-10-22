package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Necromancer extends Character {
    public Necromancer(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
        weaponClass.addAll(Weapon.oneHandedWeapon);
        weaponClass.addAll(Weapon.twoHandedWeapon);
    }
}
