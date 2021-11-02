package Game.Units;

public abstract class Entity {
    protected String name;
    protected int level;
    protected int hp = 300;
    protected int attackDamage = 50;


    protected Entity(String _name, int _level){
        name = _name;
        level = _level;
    }

    protected Entity(String _name, int _level, int _hp, int _attackDamage){
        name = _name;
        level = _level;
        hp = _hp;
        attackDamage = _attackDamage;
    }

    public void attack(Entity entity){
        entity.defend(attackDamage);
    }
    public void defend(int damage){
        hp -= damage;
    }

    //Getters
    public String getName(){ return name; }
    public int getHp(){ return hp; }
    public int getAttackDamage(){ return attackDamage; }
    public boolean isAlive(){
        return hp > 0;
    }
}
