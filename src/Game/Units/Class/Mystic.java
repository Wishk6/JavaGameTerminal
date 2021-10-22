package Game.Units.Class;

import Game.Enums.Weapon;
import Game.Units.Character;

public class Mystic extends Character {
    public Mystic(String _name) {
        super(_name);
        weaponClass.addAll(Weapon.magicalWeapon);
    }
}
