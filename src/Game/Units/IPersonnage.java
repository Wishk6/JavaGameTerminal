package Game.Units;

import Game.Items.IArme;

public interface IPersonnage {
    String getName();
    String getType();
    float getHp();
    float getAttack();
    float getDefense();
    void attack(IPersonnage target);
    void defend(IPersonnage attacker, IArme weapon , float damage);
    IArme getMainWeapon();
    void setMainWeapon(IArme weapon);
}
