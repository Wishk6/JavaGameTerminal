package Game.Units;

import Game.Items.Weapon;

public class Enemy extends Entity {
    public Enemy(String _name, int _hp,  int _attackDamage) {
        super(_name, _hp, _attackDamage);
        mainWeapon = new Weapon("Doran", 10, 1);
    }
}
