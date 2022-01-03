package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Ent extends Enemy {

    public Ent(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Ent", hp, dmg, defense, type, positionX, positionY, shout);
    }
}
