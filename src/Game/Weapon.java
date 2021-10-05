package Game;

public class Weapon
{
    WeaponType type;
    int damage;

    public Weapon(WeaponType _type)
    {
        switch(_type)
        {
            case Staff, Bow:
                damage = 20;
                break;
            case LongSword:
                damage = 30;
                break;
            case ShieldSword:
                damage = 15;
                break;
        }
    }

    public void Attack(Character _target)
    {
        if(type == WeaponType.Bow)
        {
            if(Math.random() > 0.75)
            {
                _target.Defend(damage, true);
                return;
            }
        }
        if(type == WeaponType.Staff)
        {
            if(Math.random() > 0.5)
            {
                _target.Defend(damage * 2, false);
                return;
            }
        }
        if(type == WeaponType.LongSword)
        {
            if(Math.random() > 0.5)
            {
                _target.Defend(damage * 2, false);
                return;
            }
        }
        _target.Defend(damage, false);
    }

    public WeaponType getType()
    {
        return type;
    }
}
