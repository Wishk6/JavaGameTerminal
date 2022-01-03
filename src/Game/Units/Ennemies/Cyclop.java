package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Cyclop extends Enemy {

    public Cyclop(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Cyclop", hp, dmg, defense, type, positionX, positionY, shout);
    }
}

