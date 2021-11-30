package Game.Items;

import Game.Units.IPersonnage;

public class WeaponG2 implements IArme{
    private boolean equipped;
    private String name;
    private float weight;
    private float usure;
    private float damage;
    private float precision;
    private float range;

    public WeaponG2(String name, int weight, int damage, int precision) {
        this.name = name;
        this.equipped = false;
        this.weight = weight;
        this.usure = 0;
        this.damage = damage;
        this.precision = precision;
    }

    public boolean isEquipped() {
        return this.equipped;
    }
    public void repair(float percent) {
        this.usure -= percent;
    }
    public String getName() {
        return this.name;
    };
    public float getUsure() {
        return this.usure;
    }
    public float getWeight() {
        return this.weight;
    }
    public float getDamage() {
        return this.damage;
    }

    public float getRange() {
        return this.range;
    }

    public float getPrecision() {
        return this.precision;
    }

    public float attack(IPersonnage target){
        return damage;
    }
}
