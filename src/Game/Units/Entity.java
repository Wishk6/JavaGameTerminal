package Game.Units;

import Game.Effects.Effect;
import Game.Items.Equipments.Armor;
import Game.Items.Equipments.Weapon;
import Game.Items.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    protected String name;
    protected int level;
    protected boolean confus;
    protected double health;
    protected double mana;
    protected double strengh;
    protected double armor;
    protected double magicArmor;
    protected double weight;
    protected double speed;
    protected List<Weapon> weapons = new ArrayList<>();
    protected List<Effect> effects = new ArrayList<>();
    protected List<Item> potions = new ArrayList<>();
    protected List<Armor> equipments = new ArrayList<>();


    public Entity(String _name, int _level){
        name = _name;
        level = _level;
    }

    public void attack(Entity entity){
        entity.defend();
    }
    public void heal(){

    }
    public void defend(){

    }

    //Getters
    public String getName(){ return name; }
    public Weapon getWeaponById(int id){ return weapons.get(id); }
    public List<Weapon> getWeapons(){ return weapons; }
    public List<Effect> getEffects(){
        return effects;
    }
    public boolean isDead(){
        return health <= 0;
    }


    //Setter
    public void addWeapon(Weapon _weapon){
        weapons.add(_weapon);
    }
}
