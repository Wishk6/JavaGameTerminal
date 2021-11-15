package Game.Units;

import Game.Items.IWeapon;

public interface IEntity {
    String getName();
    String getType();
    float getHp();
    float getAttack();
    void attack(IEntity target);
    void defend(IEntity attacker, IWeapon weapon ,float damage);
    float getDefense();
    IWeapon getMainWeapon();
}
