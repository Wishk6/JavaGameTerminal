package Game.Items;

import Game.Units.IEntity;

public interface IWeapon {
    boolean isEquipped();
    void repair(float percent);
    String getName();
    int getUsure();
    int getWeight();
    int getDamage();
    float getPrecision();
    int getRange();
    //void attack(IEntity target);
}