package Game.Units;

import Game.Items.IArme;

public interface IPersonnage {
    String getName();
    String getType();
    float getHp();
    float getAttack();
    void attack(IPersonnage target);
    void defend(IPersonnage attacker, IArme weapon , float damage);
    float getDefense();
    IArme getMainWeapon();
}
