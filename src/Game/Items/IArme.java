package Game.Items;

import Game.Units.IEntity;

public interface IArme {
    boolean isEquipped();
    void repair(float percent);
    String getName();
    float getUsure();
    float getWeight();
    float getDamage();
    float getPrecision();

    float getRange(); // float
    //void attack(IEntity target);
}