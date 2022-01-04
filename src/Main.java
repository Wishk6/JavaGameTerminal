import Game.Game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Game game = Game.getInstance();
        game.init();
        game.start();
    }
}