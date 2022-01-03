package Game.Units;

import Game.Items.IArme;
import Game.Items.WeaponBag;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity implements IPersonnage {
    protected String name;
    protected float hp;
    protected float attackDamage;
    protected float armor;
    protected float positionX;
    protected float positionY;
    protected String type;
    protected IArme mainWeapon;
    protected WeaponBag weapons = new WeaponBag();

    //Init
    protected Entity(String _name, float _hp, float _attackDamage, String _type,float _positionX, float _positionY){
        name = _name;
        hp = _hp;
        attackDamage = _attackDamage;
        type = _type;
        positionX = _positionX;
        positionY = _positionY;
        armor = 0.0f;
    }
    protected Entity(String _name, float _hp, float _attackDamage, String _type,float _positionX, float _positionY, float _armor){
        name = _name;
        hp = _hp;
        attackDamage = _attackDamage;
        type = _type;
        positionX = _positionX;
        positionY = _positionY;
        armor = _armor;
    }

    //Getters
    public List<String> getWeaponNames() {
        List<String> names = new ArrayList<>();

        for (IArme weapon : weapons) {
            names.add(weapon.getName());
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
        return armor;
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

    public void SetArmor(float newArmor){
        armor = newArmor;
    }

    public void AddArmor(float armorToAdd){
        armor += armorToAdd;
    }

    //Other
    public void attack(IPersonnage entity) {
        entity.defend(this, mainWeapon, getAttack());
    }

    public void defend(IPersonnage instance, IArme weapon, float damage) {
        hp -= damage + armor;
    }

    public boolean isAlive() {
        return hp > 0.0f;
    }
}