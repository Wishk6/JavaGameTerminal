package Game.Units;

import Game.Items.IArme;

public interface IEntity {
    String getName();
    String getType();
    float getHp();
    float getAttack();
    void attack(IEntity target);
    void defend(IEntity attacker, IArme weapon , float damage);
    float getDefense();
    IArme getMainWeapon();
}
