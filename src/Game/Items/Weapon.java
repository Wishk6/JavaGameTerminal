package Game.Items;

import Game.Misc.Asker;
import Game.Units.IPersonnage;

public class Weapon implements IArme {
    private final String name;
    private final float damage;
    private float usure = 0;
    private final float range;
    private final float precision;
    private boolean equipped = false;


    public Weapon(String _name, int _damage, float _precision, float _range) {
        name = _name;
        damage = _damage;
        precision = _precision;
        range = _range;
    }

    //Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getUsure() {
        return usure;
    }

    @Override
    public float getDamage() { // return string damage * precision
        if (getUsure() < 50) {
            double precisionHandler = Math.random();

            if (precisionHandler < precision) {
                usure++;
                return damage;
            } else { // if precision too low
                return 0;
            }
        } else { // if too used
            return -1;
        }
    }

    @Override
    public float getPrecision() {
        return precision;
    }

    @Override
    public float getRange() {
        return range;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public float getWeight() {
        return 1;
    }


    //Setters
    public void setEquipped(boolean _equipped) {
        equipped = _equipped;
    }

    public void repair(float percent) {
        usure -= percent;
    }

    public float attack(IPersonnage entity) {
        return 0;
    }
}