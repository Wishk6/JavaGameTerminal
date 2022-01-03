package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Goblin extends Enemy {

    public Goblin(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Goblin", hp, dmg, defense, type, positionX, positionY, shout);
    }
}
