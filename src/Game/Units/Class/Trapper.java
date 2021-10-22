package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Trapper extends Character {
    public Trapper(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.oneHandedWeapon);
        weaponClass.addAll(Weapon.rangedWeapon);
    }
}
