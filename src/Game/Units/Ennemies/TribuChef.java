package Game.Units.Ennemies;

import Game.Items.IArme;
import Game.Items.Weapon;
import Game.Units.IPersonnage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TribuChef <T> implements IPersonnage {
    ArrayList<T> tribu;
    private final String name;
    private float hp;
    private final float attackDamage;
    private final float defense;
    private float positionX;
    private float positionY;
    private List<String> shout;
    private final String type;
    protected IArme mainWeapon;

    public TribuChef(ArrayList<T> _tribu, float _dammage, float _hp, float _defence, float _x, float _y){
        this.tribu = _tribu;
        this.attackDamage = _dammage;
        this.hp = _hp;
        this.defense = _defence;
        this.positionX = _x;
        this.positionY = _y;
        this.mainWeapon = new Weapon("long sword", 20, 0.9f, 6);
        this.name = "Chef de tribu";
        this.type = "ChefDeTribu";
        this.shout = Arrays.asList("", "", "");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public float getHp() {
        return this.hp;
    }

    @Override
    public float getAttack() {
        return this.attackDamage;
    }

    @Override
    public float getDefense() {
        return this.defense;
    }

    public void attackGroup(IPersonnage target){
        float damage = 0f;
        for(T entity : this.tribu){
            IPersonnage temp = (IPersonnage) entity;
            damage += temp.getAttack() / 2;
        }

        target.defend(this, mainWeapon, damage);
    }

    @Override
    public void attack(IPersonnage target) {
        target.defend(this, mainWeapon, this.attackDamage);
    }

    @Override
    public void defend(IPersonnage attacker, IArme weapon, float damage) {
        hp -= damage * (1 - (defense / 100));
    }

    @Override
    public IArme getMainWeapon() {
        return mainWeapon;
    }

    @Override
    public void setMainWeapon(IArme weapon) {
        this.mainWeapon = weapon;
    }
}
