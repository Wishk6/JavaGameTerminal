package Game.Units;

import java.util.List;

public abstract class Character extends Entity {
    public Character(String _name, int _hp, int _attackDamage,float _defense, String _type, float _positionX, float _positionY, List<String> _shout) {
        super(_name, _hp, _attackDamage,_defense, _type, _positionX, _positionY, _shout);
        positionX = 0;
        positionY = 0;
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