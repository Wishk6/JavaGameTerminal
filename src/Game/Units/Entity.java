package Game.Units;

import Game.Effects.Effect;

import java.util.List;

public abstract class Entity {
    protected String name;
    protected int level;
    protected double health;
    protected double mana;
    protected double strengh;
    protected double armor;
    protected double magicArmor;
    protected double weight;
    protected double speed;
    protected List<Effect> Effects;


    public Entity(String _name, int _level){
        name = _name;
        level = _level;
    }

    public void attack(){

    }
    public void heal(){

    }
    public void defend(){

    }

    public List<Effect> getEffects(){
        return Effects;
    }

    public boolean isDead(){
        return health <= 0;
    }
}
