package Game;

import Game.Enums.*;
import Game.Misc.Asker;
import Game.Misc.Debug;
import Game.Units.Character;
import Game.Units.Class.Barbarian;
import Game.Units.Class.Knight;
import Game.Units.Class.Mage;
import Game.Units.Class.Rogue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    static private String name;
    static private boolean ended;
    static private Map map;
    static private Difficulty difficulty;
    static private List<Character> characters;

    static boolean isOver(){
        return ended;
    }

    static public void init(String _name, int _gameDuration, Difficulty _difficulty){
        ended = false;
        map = new Map(/*_gameDuration*/);
        characters = new ArrayList<>();
        name = _name;
        difficulty = _difficulty;

        createCharacters(Asker.askChoice(Arrays.asList("1", "2", "3", "4"), "Select team size"));
    }

    static private void createCharacters(int teamSize){
        for(int i = 0; i < teamSize; i++){
            String username = Asker.askEntry("choice your username");
            int classType = Asker.askChoice(Arrays.asList("Barbarian", "Knight", "Mage", "Rogue"), "Select your class");
            int localWeaponClass = Asker.askChoice(Arrays.asList("Ranged", "TwoHanded", "OneHanded", "Magical"), "Select your weapon speciality");

            String weapon = switch (localWeaponClass){
                case 1 -> Weapon.rangedWeapon.get(Asker.askChoice(Weapon.rangedWeapon, "Select your weapon") - 1);
                case 2 -> Weapon.twoHandedWeapon.get(Asker.askChoice(Weapon.twoHandedWeapon, "Select your weapon") - 1);
                case 3 -> Weapon.oneHandedWeapon.get(Asker.askChoice(Weapon.oneHandedWeapon, "Select your weapon") - 1);
                default -> Weapon.magicalWeapon.get(Asker.askChoice(Weapon.magicalWeapon, "Select your weapon") - 1);
            };

            WeaponClass weaponClass = switch (localWeaponClass){
                case 1 -> WeaponClass.Ranged;
                case 2 -> WeaponClass.TwoHanded;
                case 3 -> WeaponClass.OneHanded;
                default -> WeaponClass.Magical;
            };

            switch (classType) {
                case 1 -> characters.add(new Barbarian(username, weaponClass, weapon));
                case 2 -> characters.add(new Knight(username, weaponClass, weapon));
                case 3 -> characters.add(new Mage(username, weaponClass, weapon));
                default -> characters.add(new Rogue(username, weaponClass, weapon));
            }
        }
    }

    static private void createEnnemy(){

    }
}
