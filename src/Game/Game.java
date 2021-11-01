package Game;

import Game.Misc.Asker;
import Game.Units.Character;
import Game.Units.Class.*;
import Game.Units.Ennemies.Cyclop;
import Game.Units.Ennemy;
import java.util.Arrays;
import java.util.List;

public class Game {
    static private Character character;
    static private int score = 0;

    static public void init(){
        createCharacter();
    }

    static public void start(){
        boolean win;

        do {
            win = fight();
            score++;
        }while (win);
        end();
    }

    static private boolean fight(){
        Ennemy enemy = getRandomEnemy();
        while (enemy.isAlive() && character.isAlive()){
            Asker.println("");
            printStats(enemy);
            Asker.println("");

            Asker.println("Enemy attack with " + enemy.getAttackDamage());
            enemy.attack(character);

            Asker.println("");

            Asker.askChoice(character.getWeaponNames(), "Select your weapon for attack");
            Asker.println("Attack with " + character.getAttackDamage());
            character.attack(enemy);
        }
        return character.isAlive();
    }

    static private Ennemy getRandomEnemy(){
        return new Cyclop();
    }

    static private void createCharacter(){
        List<String> _charactersClass = Arrays.asList(
                "Barbarian",
                "Knight",
                "Mage",
                "Trapper"
        );


        String playerName = Asker.askEntry("Enter your name");
        int localCharacter = Asker.askChoice(_charactersClass,  playerName + " Select your class");

        switch (localCharacter){
            case 1 -> character = new Barbarian(playerName);
            case 2 -> character = new Knight(playerName);
            case 3 -> character = new Mage(playerName);
            case 4 -> character = new Trapper(playerName);
        }
    }
    static private void printStats(Ennemy enemy){
        Asker.println("Enemy HP: " + enemy.getHp());
        Asker.println("Your HP: " + character.getHp());
    }
    static private void end(){
        Asker.clear();
        Asker.println("Defeat.");
        Asker.println("Score: " + score);
    }
}