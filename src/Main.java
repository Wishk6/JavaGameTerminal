import Game.Enums.Difficulty;
import Game.Game;
import Game.Misc.Asker;
import Game.Misc.Debug;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        String name = Asker.askEntry("Enter game name");
        Difficulty difficulty;
        int gameDuration;

        int localDifficulty = Asker.askChoice(Arrays.asList("Easy", "Medium", "Hard"), "Enter game difficulty");
        difficulty = switch (localDifficulty) {
            case 1 -> Difficulty.Easy;
            case 2 -> Difficulty.Medium;
            default -> Difficulty.Hard;
        };

        int localGameDuration = Asker.askChoice(Arrays.asList("10", "30", "50"), "Enter game size");
        gameDuration = switch (localGameDuration) {
            case 1 -> 10;
            case 2 -> 30;
            default -> 50;
        };

        Game.init(name, gameDuration, difficulty);

        Debug.activate();
        Debug.println("Name: " + name + "\n" + "Difficulty: " + difficulty + "\n" + "duration: " + gameDuration);
    }
}

