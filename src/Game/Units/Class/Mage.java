package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Units.Character;
import Game.Enums.WeaponClass;

public class Mage extends Character {
    public Mage(String _name, WeaponClass _weaponClass, String _weapon) {
        super(_name, CharacterClass.Barbarian, _weaponClass, _weapon);
    }
}
