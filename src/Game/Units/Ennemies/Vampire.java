package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Vampire extends Enemy {

    public Vampire(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Vampire", hp, dmg, defense, type, positionX, positionY, shout);
    }
}
