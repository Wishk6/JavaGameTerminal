package Game.Items;

public class Weapon implements IWeapon {
    private final String name;
    private final int damage;
    private int usure = 0;
    private int precision;

    public Weapon(String _name){
        name = _name;
        damage = 10;
    }
    public Weapon(String _name, int _damage, int _precision){
        name = _name;
        damage = _damage;
        precision = _precision;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getUsure() {
        return usure;
    }
    @Override
    public int getDamage() {
        usure++;
        return  (int) (damage * precision);
    }
    @Override
    public int getPrecision() {
        return precision;
    }

    @Override
    public int getRange() {
        return 0;
    }
}
