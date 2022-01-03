package Game.Units;

import Game.Items.WeaponG2;

import java.util.List;

public class Enemy extends Entity {
    public Enemy(String _name, int _hp, int _attackDamage, float _defense, String _type, float _positionX, float _positionY, List<String> _shout) {
        super(_name, _hp, _attackDamage,_defense, _type, _positionX, _positionY, _shout);
        mainWeapon = new WeaponG2("Doran", 10, 1, 1);
    }
}
