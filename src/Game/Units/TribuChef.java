package Game.Units;

import Game.Items.IArme;
import Game.Items.Weapon;
import Game.Units.IPersonnage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TribuChef implements IPersonnage {
    List<IPersonnage> tribu;
    private final String name;
    private float hp;
    private final float attackDamage;
    private final float defense;
    private float positionX;
    private float positionY;
    private final List<String> shout;
    private final String type;
    protected IArme mainWeapon;

    public TribuChef(List<IPersonnage> _tribu, String _type, float _damage, float _hp, float _defense, float _x, float _y){
        this.tribu = _tribu;
        this.attackDamage = _damage;
        this.hp = _hp;
        this.defense = _defense;
        this.positionX = _x;
        this.positionY = _y;
        this.mainWeapon = new Weapon("long sword", 20, 0.9f, 6);
        this.name = "Chef de tribu";
        this.type = _type;

        this.shout = Arrays.asList(
            "A L'ATTAQUE " + _tribu.get(0).getType() + "s ! ",
            "Ca chatouille...",
            "Le chef est mort !  fuyez tous !!"
        );
    }

    public List<IPersonnage> getTribu(){
        return this.tribu;
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
        for(IPersonnage entity : this.tribu){
            damage += entity.getAttack() / 2;
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

    }

    @Override
    public void setMainWeapon(int id) {

    }

    @Override
    public String getShout(int index) {
        return this.shout.get(index);
    }

    @Override
    public List<String> getWeaponNames() {
        return null;
    }

    @Override
    public void setPositionX(float newXPosition) {
        this.positionX = newXPosition;
    }

    @Override
    public void setPositionY(float newYPosition) {
        this.positionY = newYPosition;
    }

    @Override
    public float getPositionX() {
        return this.positionX;
    }

    @Override
    public float getPositionY() {
        return this.positionY;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
