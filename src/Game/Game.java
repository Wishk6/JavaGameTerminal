package Game;

import Game.Enums.*;
import Game.Items.Equipments.Weapon;
import Game.Misc.Asker;
import Game.Units.Character;
import Game.Units.Class.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
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

        int teamSize = Asker.askChoice(Arrays.asList("1", "2", "3", "4"), "Select team size");

        for(int i = 0; i < teamSize; i++){
            createCharacter(i);
        }

        Asker.clear();
        Asker.println("name of game: " + name);
        Asker.println("difficulty of game: " + difficulty);
        Asker.println("game duration: " + _gameDuration + " rounds");

        for(Character character : characters){
            Asker.println("player name: " + character.getName());
            Asker.println("player start weapon: " + character.getWeaponById(0).getName());
            Asker.println("");
        }
    }

    static private void createCharacter(int idPlayer){
        List<String> _characters = new ArrayList<>();

        for(CharacterClass player : CharacterClass.values()){
            _characters.add(player.name());
        }

        int localCharacter = Asker.askChoice(_characters, "Player " + (idPlayer + 1) + " select your class");
        String playerName = Asker.askEntry("Enter your name");

        switch (localCharacter){
            case 1 -> characters.add(new Alchemist(playerName));
            case 2 -> characters.add(new Barbarian(playerName));
            case 3 -> characters.add(new Blacksmith(playerName));
            case 4 -> characters.add(new Hunter(playerName));
            case 5 -> characters.add(new Knight(playerName));
            case 6 -> characters.add(new Mage(playerName));
            case 7 -> characters.add(new Mystic(playerName));
            case 8 -> characters.add(new Necromancer(playerName));
            case 9 -> characters.add(new Paladin(playerName));
            case 10 -> characters.add(new Priest(playerName));
            case 11 -> characters.add(new Trapper(playerName));
        }

        int localWeapon = Asker.askChoice(characters.get(idPlayer).getWeaponClass(), "Select yout weapon");
        characters.get(idPlayer).addWeapon(new Weapon(characters.get(idPlayer).getWeaponClass().get(localWeapon-1)));
    }
}