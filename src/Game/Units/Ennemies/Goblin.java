package Game.Units.Ennemies;

import Game.Units.Enemy;

public class Goblin extends Enemy {

    public Goblin(int hp, int dmg, String type, float positionX, float positionY) {
        super("Goblin",hp, dmg, type, positionX, positionY);
    }
}
