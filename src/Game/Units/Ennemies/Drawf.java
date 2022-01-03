package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Drawf extends Enemy {

    public Drawf(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Drawf", hp, dmg, defense, type, positionX, positionY, shout);
    }
}