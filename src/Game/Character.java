package Game;

public class Character
{
    private String name;
    private int hp;
    private int att;
    private int def;
    private int potionRemaining;
    private Weapon weapon;

    public Character(String _name, WeaponType _type)
    {
        name = _name;
        hp = 100;
        att = 25;
        def = 5;
        potionRemaining = 5;
    }

    public void Attack(Character _target)
    {
        weapon.Attack(_target);
    }
    public void Heal(int _amount)
    {
        hp = hp + _amount;
    }

    public void Defend(int _amount, boolean _ignoreDef)
    {
        switch(weapon.type)
        {
            case Staff, LongSword:
                if(_ignoreDef)
                {
                    hp = hp - _amount;
                }
                hp = hp - Math.abs(_amount - def);
                break;
            case Bow:
                if(Math.random() > 0.5)
                {
                    break;
                }
                hp = hp - Math.abs(_amount - def);
                break;
            case ShieldSword:
                if(Math.random() > 0.5)
                {
                    break;
                }
                if(_ignoreDef)
                {
                    hp = hp - _amount;
                    break;
                }
                hp = hp - Math.abs(_amount - def);
                break;
        }
    }
    public boolean isDead()
    {
        return hp <= 0;
    }
}
