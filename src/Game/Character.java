package Game;

public class Character
{
    private String name;
    private int hp;
    private int att;
    private int def;
    private int potionRemaining;
    private Weapon weapon;

    public Character(String _name)
    {
        name = _name;
        hp = 100;
        att = 25;
        def = 5;
        potionRemaining = 5;
    }

    public void Attack(Character target)
    {

    }
    public void Heal(int hp)
    {

    }
    public void defend(int _amount, boolean _ignoreDef)
    {
        switch(weapon.type)
        {
            case Staff, Bow, LongSword:
                if(_ignoreDef)
                {
                    hp = hp - _amount;
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
