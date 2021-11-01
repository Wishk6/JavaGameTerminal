package Game.Units;

import Game.Items.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Entity {
    private int experiences;
    private int experienceToMax;
    protected List<String> weaponClass;
    protected List<Weapon> weapons = new ArrayList<>();

    public Character(String _name, int _attackDamage, int _hp) {
        super(_name, 1, _hp, _attackDamage);
        weaponClass = new ArrayList<>();
        experiences = 0;
        calculMaxExperience();
    }

    private void calculMaxExperience(){
        experienceToMax = (int) (2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140);
    }


    //Getter
    public List<String> getWeaponNames(){
        List<String> names = new ArrayList<>();

        for(Weapon weapon : weapons){
            names.add(weapon.getName());
        }
        return names;
    }


    //Setter
    public void addWeapon(Weapon _weapon){
        weapons.add(_weapon);
    }
}
