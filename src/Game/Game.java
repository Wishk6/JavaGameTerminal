package Game;

import Game.Misc.Asker;
import Game.Units.Character;
import Game.Units.Class.*;
import Game.Units.Enemy;
import java.util.Arrays;
import java.util.List;

public class Game {
    private static final Game game = new Game();
    private Character character;
    private int score = 0;

    private Game(){}

    public static Game getInstance(){
        return game;
    }

    public void init(){
        createCharacter();
    }

    public void start(){
        boolean win;

        do {
            win = fight();
            System.out.println("your score is " + score);
            Asker.clear();
        }while (win);// while win is true
    }

    private boolean fight(){
        Enemy enemy = getRandomEnemy(); // create random enemy

        Asker.println("A " + enemy.getName() + " is attacking you ! It will deal " + enemy.getAttack() + " damages each turn");
        printStats(enemy);
        while (enemy.isAlive() && character.isAlive()){

            Asker.println("");

            int weaponId = Asker.askChoice(character.getWeaponNames(), "Select a weapon to attack this " + enemy.getName());
            character.setMainWeapon(weaponId - 1);
            Asker.println("You are attacking " + enemy.getName());
            Asker.clear();
            if (character.getAttack() != 0) {
                Asker.println("enemy loses " + character.getAttack() + "HP !");
            } else {
                Asker.println("No damage dealt !");
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

    private Enemy getRandomEnemy(){
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
        return new Enemy(randomEnemy,randomHp,randomDamage, randomEnemy);
    }

    private void createCharacter(){
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

    private void printStats(Enemy enemy){
        Asker.println("Enemy have " + enemy.getHp() + " HP");
        Asker.println("You have " + character.getHp()+ " HP");
    }

    private void kill() {
        Asker.clear();
        Asker.println(" Enemy killed ! ");
        score++;
    }

    private void end(){
        Asker.clear();
        Asker.println("Defeat...");
    }
}