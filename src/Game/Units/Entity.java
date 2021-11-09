package Game.Units;

import Game.Items.IWeapon;
import Game.Items.WeaponBag;
import Game.Misc.Asker;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    protected String name;
    protected int level;
    protected int hp = 300;
    protected int attackDamage = 50;
    protected WeaponBag weapons = new WeaponBag();


    protected Entity(String _name, int _level, int _hp, int _attackDamage){
        name = _name;
        level = _level;
        hp = _hp;
        attackDamage = _attackDamage;
    }

    public void attack(Entity entity){
        entity.defend(attackDamage);
    }
    public void attack(Entity entity, int weaponId){
        IWeapon weapon = getWeaponById(weaponId);

        entity.defend(attackDamage + weapon.getDamage());
        if(weapon.getUsure() >= 100){
            weapons.remove(weaponId);
            Asker.println("Weapon " + weapon.getName() + " will be removed because it is too ruined.");
        }
    }
    public void defend(int damage){
        hp -= damage;
    }

    //Getters
    public List<String> getWeaponNames(){
        List<String> names = new ArrayList<>();

        for(IWeapon weapon : weapons){
            names.add(weapon.getName());
        }
        return names;
    }
    private IWeapon getWeaponById(int id){
        return weapons.get(id);
    }
    public String getName(){ return name; }
    public int getHp(){ return hp; }
    public int getAttackDamage(){ return attackDamage; }
    public boolean isAlive(){
        return hp > 0;
    }
}
