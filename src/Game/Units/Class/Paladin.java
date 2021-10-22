package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Paladin extends Character {
    public Paladin(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
        weaponClass.addAll(Weapon.twoHandedWeapon);
    }
}
