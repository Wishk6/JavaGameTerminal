package Game.Units;

import Game.Items.IWeapon;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Entity {
    public Character(String _name, int _attackDamage, int _hp) {
        super(_name, 1, _hp, _attackDamage);
    }
}

//2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140

/*
public interface IArme {
    boolean isEquipped();
    void repair(float percent);
    String getName();
    int getUsure();
    int getWeight();
    int getDamage();
    int getPrecision();
    int getRange();
    void attack(IPersonnage target);

}

public interface IPersonnage {
    String getName();
    String getType();
    float getHp();
    float getAttack();
    void attack(IPersonnage target);
    void defense(IPersonnage attacker ,IArme weapon ,float damage);
    float getDefense();
    IArme getMainWeapon();
}
*/