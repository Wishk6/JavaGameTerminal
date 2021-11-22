package Game.Enums;

import Game.Items.Weapon;

import java.util.Arrays;
import java.util.List;

public class WeaponList {
    static private List<Weapon> magicalWeapon = Arrays.asList(
            new Weapon("Tome", 15 , 1, 1),
            new Weapon("Wand", 13 , 1, 1),
            new Weapon("Staff", 12 , 1, 0.3f),
            new Weapon("Orb", 10 , 1, 1),
            new Weapon("Lyre", 10 , 1, 1),
            new Weapon("Glove", 20 , 1, 0.1f),
            new Weapon("GemStone", 10 , 1, 1)
    );
    static private List<Weapon> oneHandedWeapon = Arrays.asList(
            new Weapon("Katana", 20 , 1, 1),
            new Weapon("Sword", 20 , 1, 1),
            new Weapon("ShieldSword", 20 , 1, 1),
            new Weapon("Axe", 20 , 1, 1),
            new Weapon("DoubleAxe", 20 , 1, 1),
            new Weapon("DoubleDagger", 20 , 1, 1),
            new Weapon("Flail", 20 , 1, 1),
            new Weapon("GemStone", 10 , 1, 1)
    );
    static private List<Weapon> twoHandedWeapon = Arrays.asList(
            new Weapon("WarHammer", 20 , 0.95f, 0.1f),
            new Weapon("BattleAxe", 18 , 0.89f, 0.1f),
            new Weapon("LongSword", 15 , 1, 0.4f),
            new Weapon("Spear", 15 , 0.89f, 1),
            new Weapon("Nadachi", 12 , 1, 0.9f),
            new Weapon("Ohmlatl", 15 , 0.9f, 0.8f)
    );
    static private List<Weapon> rangedWeapon = Arrays.asList(
            new Weapon("Bow", 10 , 1, 1),
            new Weapon("CrossBow", 10 , 1, 1),
            new Weapon("Kunai", 10 , 1, 1),
            new Weapon("Shurikens", 10 , 1, 1),
            new Weapon("Gun", 10 , 1, 1),
            new Weapon("DoubleGun", 10 , 1, 1),
            new Weapon("ShortGun", 10 , 1, 1)
    );


    public static List<Weapon> getMagicalWeapon(){
        return magicalWeapon;
    }
    public static List<Weapon> getRangedWeapon(){
        return rangedWeapon;
    }
    public static List<Weapon> getOneHandedWeapon(){
        return oneHandedWeapon;
    }
    public static List<Weapon> getTwoHandedWeapon(){
        return twoHandedWeapon;
    }
}
