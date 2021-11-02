package Game.Units;

import Game.Items.IWeapon;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Entity {
    protected WeaponBag weapons = new WeaponBag();

    public Character(String _name, int _attackDamage, int _hp) {
        super(_name, 1, _hp, _attackDamage);
    }

    //Getter
    public List<String> getWeaponNames(){
        List<String> names = new ArrayList<>();

        for(IWeapon weapon : weapons){
            names.add(weapon.getName());
        }
        return names;
    }
}

//2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140