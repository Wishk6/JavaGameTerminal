package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.Weapon;
import Game.Units.Character;
import Game.Enums.WeaponClass;

public class Knight extends Character {
    public Knight(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.oneHandedWeapon);
        weaponClass.addAll(Weapon.twoHandedWeapon);
        weaponClass.addAll(Weapon.rangedWeapon);
    }
}
