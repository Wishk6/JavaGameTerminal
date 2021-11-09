package Game.Units;

import Game.Items.IWeapon;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Entity {
    public Character(String _name, int _attackDamage, int _hp) {
        super(_name, 1, _hp, _attackDamage);
    }

    //Getter
}

//2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140