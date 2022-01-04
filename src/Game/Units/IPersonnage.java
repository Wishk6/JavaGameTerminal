package Game.Units;

import Game.Items.IArme;
import java.util.List;

public interface IPersonnage {
    String getName();

    String getType();

    float getHp();

    float getAttack();

    float getDefense();

    void attack(IPersonnage target);

    void defend(IPersonnage attacker, IArme weapon, float damage);

    IArme getMainWeapon();

    void setMainWeapon(IArme weapon);

    void setMainWeapon(int id);

    String getShout(int index);

    List<String> getWeaponNames();

    void setPositionX(float newXPosition);

    void setPositionY(float newYPosition);

    float getPositionX();

    float getPositionY();

    boolean isAlive();
}
