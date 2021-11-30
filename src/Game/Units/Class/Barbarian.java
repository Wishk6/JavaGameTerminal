package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Barbarian extends Character {
    public Barbarian(String _name) {
        super(_name, 75, 500, "Character", 0, 0);
        weapons.addAll(WeaponList.getTwoHandedWeapon());
    }
}
