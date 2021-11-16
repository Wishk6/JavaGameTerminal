package Game.Units;

import Game.Items.IWeapon;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity implements IEntity {
    protected String name;
    protected float hp;
    protected float attackDamage;
    protected float armor;
    protected IWeapon mainWeapon;
    protected WeaponBag weapons = new WeaponBag();


        //Init
    protected Entity(String _name, float _hp, float _attackDamage){
        name = _name;
        hp = _hp;
        attackDamage = _attackDamage;
    }


        //Getters
    public List<String> getWeaponNames(){
        List<String> names = new ArrayList<>();

        for(IWeapon weapon : weapons){
            names.add(weapon.getName());
        }
        return names;
    }
    public String getName(){
        return name;
    }
    public float getHp(){
        return hp;
    }
    public float getAttack(){
        return attackDamage + mainWeapon.getDamage();
    }
    public String getType(){
        return "";
    }
    public float getDefense(){
        return armor;
    }
    public IWeapon getMainWeapon(){
        return mainWeapon;
    }


        //Setters
    public void setMainWeapon(int weaponId) {
        mainWeapon = weapons.get(weaponId);
    }

    //Other
    public void attack(IEntity entity){
        entity.defend(entity, entity.getMainWeapon(), entity.getAttack());
    }
    public void defend(IEntity attacker, IWeapon weapon ,float damage){
        hp -= damage + weapon.getDamage();
    }
    public boolean isAlive(){
        return hp > 0;
    }
}