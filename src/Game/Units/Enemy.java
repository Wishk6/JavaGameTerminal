package Game.Units;

import Game.Items.WeaponG2;

public class Enemy extends Entity {
    public Enemy(String _name, int _hp, int _attackDamage, String _type, float positionX, float positionY) {
        super(_name, _hp, _attackDamage, _type, positionX, positionY);
        mainWeapon = new WeaponG2("Doran", 10, 1, 1);
    }
}
