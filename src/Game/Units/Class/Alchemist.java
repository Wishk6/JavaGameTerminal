package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Alchemist extends Character {
    public Alchemist(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
        weaponClass.addAll(Weapon.oneHandedWeapon);
    }
}
