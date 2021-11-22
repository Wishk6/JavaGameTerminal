package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Trapper extends Character {
    public Trapper(String _name) {
        super(_name, 125, 300, "Enemy");
        weapons.addAll(WeaponList.getRangedWeapon());
    }
}
