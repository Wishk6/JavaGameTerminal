package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Trapper extends Character {
    public Trapper(String _name) {
        super(_name, 300, 300);
        weapons.addAll(WeaponList.rangedWeapon);
    }
}
