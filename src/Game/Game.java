package Game;

import Game.Misc.Asker;
import Game.Units.Class.*;
import Game.Units.Enemy;
import Game.Units.TribuChef;
import Game.Units.IPersonnage;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Game {
    private static final Game game = new Game();
    private IPersonnage character;
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

        Asker.println("A " + enemy.getName() + " is attacking you ! It will deal " + enemy.getAttack() * (1 - (character.getDefense() / 100)) + " damages each turn\n");
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
            Asker.println("");



            if (character.getType().equals("Chef")) {
                final TribuChef chef = (TribuChef) character;
                int choiceId = Asker.askChoice(List.of("Attack with my weapon","Attack with my soldiers"), "Select a way to attack this " + enemy.getName());
                Asker.println("Your team is attacking " + enemy.getName());
                Asker.println("Choices" + choiceId);
                if (choiceId == 1) {
                    chef.attack(enemy);
                } else {
                    chef.attackGroup(enemy);
                    for(IPersonnage ent : chef.getTribu()){
                        Asker.println(ent.getShout(0));
                    }
                }
                enemy.attack(character);

                Asker.println("\u001B[34m" + character.getShout(0) + "\u001B[0m" + "\n");  // defense shout
                Asker.println("\u001B[34m" + enemy.getShout(1) + "\u001B[0m" + "\n");  // defense shout
                Asker.println("\u001B[32m" + "enemy loses " + character.getAttack() * (1 - (enemy.getDefense() / 100)) + "HP !" + "\u001B[0m");

            } else {
                int weaponId = Asker.askChoice(character.getWeaponNames(), "Select a weapon to attack this " + enemy.getName());
                character.setMainWeapon(weaponId - 1);
                Asker.println("You are attacking " + enemy.getName());
                Asker.clear();
            }
            final float xDistance = Math.abs(enemy.getPositionX() - character.getPositionX());
            final float yDistance = Math.abs(enemy.getPositionY() - character.getPositionY());

            if (xDistance >= character.getMainWeapon().getRange() && yDistance >= character.getMainWeapon().getRange()) {
                Asker.println("\u001B[31m" + "No damage dealt ! You are too far away !" + "\u001B[0m"); // - 4 usure
                printStats(enemy);

            } else if (character.getAttack() > 0) {


                enemy.attack(character);
                Asker.println("\u001B[34m" + enemy.getShout(0) + "\u001B[0m" + "\n"); // atta shout
                Asker.println("\u001B[34m" + character.getShout(1) + "\u001B[0m" + "\n"); //  def shout
                character.attack(enemy);
                Asker.println("\u001B[34m" + character.getShout(0) + "\u001B[0m" + "\n"); // atta shout
                Asker.println("\u001B[34m" + enemy.getShout(1) + "\u001B[0m" + "\n");  // defense shout
                Asker.println("\u001B[32m" + "enemy loses " + character.getAttack() * (1 - (enemy.getDefense() / 100)) + "HP !" + "\u001B[0m"); // - 6 usure

                printStats(enemy);
            } else if (character.getAttack() == 0) {
                Asker.println("\u001B[31m" + "No damage dealt ! You missed your shot !" + "\u001B[0m"); // - 8
                enemy.attack(character);
                printStats(enemy);

            } else if (character.getMainWeapon().getUsure() >= 50) {
                Asker.println("\u001B[31m" + "No damage dealt ! Your weapon is worn out !" + "\u001B[0m"); // - 10
                enemy.attack(character);
                printStats(enemy);
            }


        }
        if (!enemy.isAlive() && character.isAlive()) {
            Asker.println("\u001B[31m" + enemy.getShout(2) + "\u001B[0m" + "\n");
            kill();
        } else {
            Asker.println("\u001B[31m" + character.getShout(2) + "\u001B[0m" + "\n");
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

        List<String> _enemyAttackShouts = Arrays.asList(
                "Beuargh",
                "cthu lhu lhu",
                "Arglglglglgl!"
        );

        List<String> _enemyDefenseShouts = Arrays.asList(
                "OUUUUUH CA FAIT MAL",
                "BAF !",
                "SPLAF !",
                "PAF !",
                "SPAF !",
                "BAM !"
        );

        List<String> _enemyDeathShouts = Arrays.asList(
                "AAAAAAAARRGGH...",
                "LUC....",
                "NON POURQUOI SERIEUX",
                "ALED",
                "Je meurs.."
        );

        String randomEnemy = _charactersClass.get((int) (Math.random() * _charactersClass.size())); // get random index
        int randomDamage = (int) (Math.random() * 70); // 60 dmg max
        int randomHp = (int) (Math.random() * 300); // random max 300 hp
        float randomY = (int) (Math.random() * 10); // random position Y
        float randomX = (int) (Math.random() * 10); // random position X
        float randomDef = (int) (Math.random() * 20); // random defense Max 20 %
        String randomAttackShout = _enemyDefenseShouts.get((int) (Math.random() * _enemyAttackShouts.size()));
        String randomDefShout = _enemyDefenseShouts.get((int) (Math.random() * _enemyDefenseShouts.size()));
        String randomDeathShout = _enemyDefenseShouts.get((int) (Math.random() * _enemyDeathShouts.size()));

        List<String> shoutsArray = Arrays.asList(
                randomAttackShout,
                randomDefShout,
                randomDeathShout
        );

        return new Enemy(randomEnemy, randomHp, randomDamage, randomDef, randomEnemy, randomX, randomY, shoutsArray);
    }

    private void createCharacter() {
        List<String> _charactersClass = Arrays.asList(
                "Barbarian",
                "Knight",
                "Mage",
                "Trapper",
                "Chef Barbarian",
                "Chef Knight",
                "Chef Mage",
                "Chef Trapper"
        );

        String playerName = Asker.askEntry("Enter your name");
        int localCharacter = Asker.askChoice(_charactersClass, playerName + " Select your class");

        switch (localCharacter) {
            case 1 -> character = new Barbarian(playerName);
            case 2 -> character = new Knight(playerName);
            case 3 -> character = new Mage(playerName);
            case 4 -> character = new Trapper(playerName);
            case 5 -> character = new TribuChef(List.of(new Barbarian("")), "Chef", 40, 1000, 30, 0, 0);
            case 6 -> character = new TribuChef(List.of(new Mage("")), "Chef", 150, 500, 15, 0, 0);
            case 7 -> character = new TribuChef(List.of(new Trapper("")), "Chef", 125, 600, 15, 0, 0);
            case 8 -> character = new TribuChef(List.of(new Knight("")), "Chef", 60, 1200, 30, 0, 0);
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