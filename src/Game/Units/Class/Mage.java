package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Mage extends Character {
    public Mage(String _name) {
        super(_name, 150, 250);
        weapons.addAll(WeaponList.getMagicalWeapon());
    }
}
