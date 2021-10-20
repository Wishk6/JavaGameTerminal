package Game.Units.Class;

import Game.Enums.CharacterClass;
import Game.Enums.WeaponClass;
import Game.Units.Character;

public class Barbarian extends Character {
    public Barbarian(String _name, WeaponClass _weaponClass, String _weapon) {
        super(_name, CharacterClass.Barbarian, _weaponClass, _weapon);
    }
}
