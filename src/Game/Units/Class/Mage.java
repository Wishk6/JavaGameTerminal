package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.Weapon;
import Game.Units.Character;
import Game.Enums.WeaponClass;

public class Mage extends Character {
    public Mage(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
        weaponClass.addAll(Weapon.rangedWeapon);
    }
}
