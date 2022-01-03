package Game.Units.Ennemies;

import Game.Units.Enemy;

import java.util.List;

public class Giant extends Enemy {

    public Giant(int hp, int dmg, float defense, String type, float positionX, float positionY, List<String> shout) {
        super("Giant", hp, dmg, defense, type, positionX, positionY, shout);
    }
}
