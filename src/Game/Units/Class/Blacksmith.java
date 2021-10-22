package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.Weapon;
import Game.Units.Character;

public class Blacksmith extends Character {
    public Blacksmith(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.twoHandedWeapon);
        weaponClass.addAll(Weapon.rangedWeapon);
    }
}
