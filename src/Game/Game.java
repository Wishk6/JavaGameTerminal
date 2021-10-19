package Game;

import Game.Enums.Difficulty;

import java.util.ArrayList;
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
    }
}
