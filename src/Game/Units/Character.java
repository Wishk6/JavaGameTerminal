package Game.Units;

import Game.Enums.CharacterClass;
import Game.Enums.WeaponClass;

public abstract class Character extends Entity {
    private CharacterClass characterClass;
    private int experiences;
    private int experienceToMax;
    protected WeaponClass weaponClass;

    public Character(String _name, CharacterClass _characterClass, WeaponClass _weaponClass) {
        super(_name, 1);
        weaponClass = _weaponClass;
        characterClass = _characterClass;
        experiences = 0;
        calculMaxExperience();
    }

    public int getExperience(){
        return experiences;
    }

    protected void addExperience(int _addToExperience){
        if(experiences + _addToExperience >= experienceToMax){
            experiences = 0;
            calculMaxExperience();
            level++;
            return;
        }
        experiences += _addToExperience;
    }

    private void calculMaxExperience(){
        experienceToMax = (int) (2.5 * (level * level * level) - 5 * (level * level) + 200 * level - 140);
    }
}
