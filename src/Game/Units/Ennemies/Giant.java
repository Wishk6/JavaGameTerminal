package Game.Units.Ennemies;

import Game.Units.Enemy;

public class Giant extends Enemy {

    public Giant(int hp, int dmg, String type, float positionX, float positionY) {
        super("Giant", hp, dmg, type, positionX, positionY);
    }
}
