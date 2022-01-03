package Game.Units;

import Game.Items.IArme;
import Game.Items.WeaponBag;
import Game.Misc.Asker;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity implements IPersonnage {
    protected String name;
    protected float hp;
    protected float attackDamage;
    protected float defense;
    protected float positionX;
    protected float positionY;
    protected List<String> shout;
    protected String type;
    protected IArme mainWeapon;
    protected WeaponBag weapons = new WeaponBag();

    //Init
    protected Entity(String _name, float _hp, float _attackDamage, float _defense, String _type, float _positionX, float _positionY, List<String> _shout) {
        name = _name;
        hp = _hp;
        attackDamage = _attackDamage;
        defense = _defense;
        type = _type;
        positionX = _positionX;
        positionY = _positionY;
        shout = _shout;
    }

    //Getters
    public List<String> getWeaponNames() {
        List<String> names = new ArrayList<>();

        for (IArme weapon : weapons) {
            names.add(weapon.getName() + " (usure: " + (int)weapon.getUsure() + "/50)");
        }
        return names;
    }

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }

    public float getAttack() {
        if (mainWeapon.getDamage() > 0)
            return attackDamage + mainWeapon.getDamage();
        else
            return mainWeapon.getDamage();
    }

    //Getters
    public String getType() {
        return type;
    }

    public float getDefense() {
        return defense;
    }

    public IArme getMainWeapon() {
        return mainWeapon;
    }

    public float getPositionX() {
        return positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public String getShout(int index) {
        return shout.get(index);
    }

    //Setters
    public void setMainWeapon(int weaponId) {
        mainWeapon = weapons.get(weaponId);
    }

    public void setMainWeapon(IArme weapon) {
    }

    public void setPositionX(float newXPosition) {
        positionX = newXPosition;
    }

    public void setPositionY(float newYPosition) {
        positionY = newYPosition;
    }


    //Other
    public void attack(IPersonnage entity) {
        entity.defend(this, mainWeapon, getAttack());
    }

    public void defend(IPersonnage instance, IArme weapon, float damage) {
        hp -= damage * (1 - (defense / 100));
    }

    public boolean isAlive() {
        return hp > 0.0f;
    }
}