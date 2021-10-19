package Game;

import Game.Enums.CharacterClass;
import Game.Enums.Difficulty;
import Game.Enums.WeaponClass;
import Game.Misc.Asker;
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
            int localClassType = Asker.askChoice(Arrays.asList("Barbarian", "Knight", "Mage", "Rogue"), "Select your class");
            int localWeaponClass = Asker.askChoice(Arrays.asList("Ranged", "TwoHanded", "OneHanded", "Magical"), "Select your weapon speciality");
            WeaponClass weaponClass = switch (localWeaponClass){
                case 1 -> WeaponClass.Ranged;
                case 2 -> WeaponClass.TwoHanded;
                case 3 -> WeaponClass.OneHanded;
                default -> WeaponClass.Magical;
            };

            switch (localClassType) {
                case 1 -> characters.add(new Barbarian(username, CharacterClass.Barbarian, weaponClass));
                case 2 -> characters.add(new Knight(username, CharacterClass.Knight, weaponClass));
                case 3 -> characters.add(new Mage(username, CharacterClass.Mage, weaponClass));
                default -> characters.add(new Rogue(username, CharacterClass.Rogue, weaponClass));
            };
        }
    }
}
