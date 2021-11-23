package Game.Items;

import Game.Units.IPersonnage;

public interface IArme {
    boolean isEquipped();
    void repair(float percent);
    String getName();
    float getUsure();
    float getWeight();
    float getDamage();
    float getPrecision();

    float getRange(); // float
    void attack(IPersonnage target);
}