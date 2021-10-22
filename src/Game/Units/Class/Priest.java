package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Priest extends Character {
    public Priest(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
    }
}
