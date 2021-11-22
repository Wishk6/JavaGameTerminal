package Game.Units;

import Game.Items.IArme;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity implements IEntity {
    protected String name;
    protected float hp;
    protected float attackDamage;
    protected float armor;
    protected String type;
    private Entity instance;
    protected IArme mainWeapon;
    protected WeaponBag weapons = new WeaponBag();


        //Init
    protected Entity(String _name, float _hp, float _attackDamage, String _type){
        name = _name;
        hp = _hp;
        attackDamage = _attackDamage;
        type = _type;
    }

        //Getters
    public List<String> getWeaponNames(){
        List<String> names = new ArrayList<>();

        for(IArme weapon : weapons){
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
        return type;
    }
    public float getDefense(){
        return armor;
    }
    public IArme getMainWeapon(){
        return mainWeapon;
    }


        //Setters
    public void setMainWeapon(int weaponId) {
        mainWeapon = weapons.get(weaponId);
    }


    //Other
    public void attack(IEntity entity){ // enemy.attack(character)
        entity.defend(this, mainWeapon, getAttack());
    }

    public void defend(IEntity instance, IArme weapon , float damage){
        hp -= damage;  // pb : l'entity s'attaque elle même
    }

    public boolean isAlive(){
        return hp > 0;
    }
}