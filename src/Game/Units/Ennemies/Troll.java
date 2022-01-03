package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Troll extends Enemy {

    public Troll(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Troll", hp, dmg, defense, type, positionX, positionY, shout);
    }
}
