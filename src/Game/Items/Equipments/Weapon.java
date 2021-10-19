package Game.Items.Equipments;

import Game.Units.Character;
import Game.Enums.WeaponClass;

public class Weapon
{
    private WeaponClass type;
    private int damage;

    public Weapon(WeaponClass _type){
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

    public void Attack(Character _target){
        if(type == WeaponClass.Bow)
        {
            if(Math.random() > 0.75)
            {
                _target.Defend(damage, true);
                return;
            }
        }
        if(type == WeaponClass.Staff)
        {
            if(Math.random() > 0.5)
            {
                _target.Defend(damage * 2, false);
                return;
            }
        }
        if(type == WeaponClass.LongSword)
        {
            if(Math.random() > 0.5)
            {
                _target.Defend(damage * 2, false);
                return;
            }
        }
        _target.Defend(damage, false);
    }

    public WeaponClass getType()
    {
        return type;
    }
}
