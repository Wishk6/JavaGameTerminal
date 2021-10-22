package Game.Units;

import Game.Enums.CharacterClass;
import Game.Enums.WeaponClass;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Entity {
    private int experiences;
    private int experienceToMax;
    protected List<String> weaponClass;

    public Character(String _name) {
        super(_name, 1);
        weaponClass = new ArrayList<>();
        experiences = 0;
        calculMaxExperience();
    }

    public int getExperience(){
        return experiences;
    }

    private void calculMaxExperience(){
        experienceToMax = (int) (2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140);
    }

    //setters
    public List<String> getWeaponClass(){
        return weaponClass;
    }
}
