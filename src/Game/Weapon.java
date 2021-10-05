package Game;

enum WeaponType
{
    LongSword,
    Bow,
    ShieldSword,
    Staff,
}

public class Weapon
{
    WeaponType type;
    int damage;

    public int Attack()
    {
        if(type == WeaponType.Bow)
        {
            if(Math.random() > 0.5)
            {
                return damage * 2;
            }
        }
        return damage;
    }
}
