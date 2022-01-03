package Game.Units;

public abstract class Character extends Entity {
    public Character(String _name, int _attackDamage, int _hp, String _type, float _positionX, float _positionY) {
        super(_name, _hp, _attackDamage, _type, _positionX, _positionY);
        positionX = 0;
        positionY = 0;
    }
}

//2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140
