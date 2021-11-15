package Game.Items;

public class Weapon implements IWeapon {
    private final String name;
    private int damage;
    private int usure = 0;
    private int range;
    private float precision = 1;
    private boolean equipped = false;

        //Init
    public Weapon(String _name){
        name = _name;
        damage = 10;
        range = 1;
    }
    public Weapon(String _name, int _damage, float _precision){
        name = _name;
        damage = _damage;
        precision = _precision;
        range = 1;
    }

        //Getters
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
    public float getPrecision() {
        return precision;
    }
    @Override
    public int getRange() {
        return range;
    }
    public boolean isEquipped(){
        return equipped;
    }
    public int getWeight(){
        return 1;
    }


        //Setters
    public void setEquipped(boolean _equipped){
        equipped = _equipped;
    }
    public void repair(float percent){

    }
}
