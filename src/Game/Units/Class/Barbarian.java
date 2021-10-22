package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.Weapon;
import Game.Enums.WeaponClass;
import Game.Units.Character;

public class Barbarian extends Character {
    public Barbarian(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.oneHandedWeapon);
    }
}
