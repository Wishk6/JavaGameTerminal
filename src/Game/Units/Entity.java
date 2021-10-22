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
    protected Weapon weapon;
    protected List<Effect> effects;
    protected List<Item> potions;
    protected List<Armor> equipments;


    public Entity(String _name, int _level){
        name = _name;
        level = _level;
        effects = new ArrayList<>();
        potions = new ArrayList<>();
        equipments = new ArrayList<>();

    }

    public void attack(){

    }
    public void heal(){

    }
    public void defend(){

    }

    public List<Effect> getEffects(){
        return effects;
    }

    public boolean isDead(){
        return health <= 0;
    }



    //Setter
    public void setWeapon(Weapon _weapon){
        weapon = _weapon;
    }
}
