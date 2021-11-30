package Game;

import Game.Misc.Asker;
import Game.Units.Character;
import Game.Units.Class.*;
import Game.Units.Enemy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Game {
    private static final Game game = new Game();
    private Character character;
    private int score = 0;

    private Game() {
    }

    public static Game getInstance() {
        return game;
    }

    public void init() {
        createCharacter();
    }

    public void start() {
        boolean win;

        do {
            win = fight();
            System.out.println("your score is " + score);
            Asker.clear();
        } while (win);// while win is true
    }

    private boolean fight() {
        Enemy enemy = getRandomEnemy(); // create random enemy

        Asker.println("A " + enemy.getName() + " is attacking you ! It will deal " + enemy.getAttack() + " damages each turn");
        printStats(enemy);
        while (enemy.isAlive() && character.isAlive()) {

            Asker.println("");
            Asker.println("Your X position : " + character.getPositionX());
            Asker.println("Your Y position : " + character.getPositionY());
            Asker.println("Enemy X position : " + enemy.getPositionX());
            Asker.println("Enemy Y position : " + enemy.getPositionY());
            String positionSet = Asker.askEntry(" Do you want to move ? (O/N)");
            if (Objects.equals(positionSet, "O")) {
                character.setPositionX(enemy.getPositionX()); // nous colle à l"enemi
                character.setPositionY(enemy.getPositionY());
            }
            if (Objects.equals(positionSet, "N")) {
                Asker.println("You keep your position");
            }

            Asker.println("Your X position : " + character.getPositionX());
            Asker.println("Your Y position : " + character.getPositionY());
            Asker.println("Enemy X position : " + enemy.getPositionX());
            Asker.println("Enemy Y position : " + enemy.getPositionY());
            int weaponId = Asker.askChoice(character.getWeaponNames(), "Select a weapon to attack this " + enemy.getName());
            character.setMainWeapon(weaponId - 1);
            Asker.println("You are attacking " + enemy.getName());
            Asker.clear();
            if (character.getAttack() != 0 && enemy.getPositionX() == character.getPositionX()  && enemy.getPositionY() == character.getPositionY()) {
                Asker.println("enemy loses " + character.getAttack() + "HP !");
            } else {
                Asker.println("No damage dealt ! Maybe you're too far away, of your weapon is broken !");
            }
            enemy.attack(character);
            character.attack(enemy);
            printStats(enemy);
        }
        if (!enemy.isAlive() && character.isAlive()) {
            kill();
        } else {
            end();
        }
        return character.isAlive();
    }

    private Enemy getRandomEnemy() {
        List<String> _charactersClass = Arrays.asList(
                "Cyclop",
                "Drawf",
                "Ent",
                "Giant",
                "Goblin",
                "Troll",
                "Vampire"
        );
        String randomEnemy = _charactersClass.get((int) (Math.random() * _charactersClass.size())); // get random index
        int randomDamage = (int) (Math.random() * 60); // 60 dmg max
        int randomHp = (int) (Math.random() * 300); // random max 300 hp
        int randomY = (int) (Math.random() * 10); // random max 300 hp
        int randomX = (int) (Math.random() * 10); // random max 300 hp
        return new Enemy(randomEnemy, randomHp, randomDamage, randomEnemy, randomX, randomY);
    }

    private void createCharacter() {
        List<String> _charactersClass = Arrays.asList(
                "Barbarian",
                "Knight",
                "Mage",
                "Trapper"
        );

        String playerName = Asker.askEntry("Enter your name");
        int localCharacter = Asker.askChoice(_charactersClass, playerName + " Select your class");

        switch (localCharacter) {
            case 1 -> character = new Barbarian(playerName);
            case 2 -> character = new Knight(playerName);
            case 3 -> character = new Mage(playerName);
            case 4 -> character = new Trapper(playerName);
        }
    }

    private void printStats(Enemy enemy) {
        Asker.println("Enemy have " + enemy.getHp() + " HP");
        Asker.println("You have " + character.getHp() + " HP");
    }

    private void kill() {
        Asker.clear();
        Asker.println(" Enemy killed ! ");
        score++;
    }

    private void end() {
        Asker.clear();
        Asker.println("Defeat...");
    }
}