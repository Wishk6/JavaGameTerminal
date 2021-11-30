package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Knight extends Character {
    public Knight(String _name) {
        super(_name, 100, 400, "Character", 0, 0);
        weapons.addAll(WeaponList.getOneHandedWeapon());
    }
}
