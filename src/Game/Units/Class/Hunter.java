package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.Weapon;
import Game.Units.Character;

public class Hunter extends Character {
    public Hunter(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.rangedWeapon);
    }
}
