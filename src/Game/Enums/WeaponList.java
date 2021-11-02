package Game.Enums;

import Game.Items.Weapon;

import java.util.Arrays;
import java.util.List;

public class WeaponList {
    static private List<Weapon> magicalWeapon = Arrays.asList(
            new Weapon("Tome"),
            new Weapon("Wand"),
            new Weapon("Staff"),
            new Weapon("Orb"),
            new Weapon("Lyre"),
            new Weapon("Glove"),
            new Weapon("GemStone")
    );
    static private List<Weapon> oneHandedWeapon = Arrays.asList(
            new Weapon("Katana"),
            new Weapon("Sword"),
            new Weapon("ShieldSword"),
            new Weapon("Axe"),
            new Weapon("DoubleAxe"),
            new Weapon("DoubleDagger"),
            new Weapon("Flail")
    );
    static private List<Weapon> twoHandedWeapon = Arrays.asList(
            new Weapon("WarHammer"),
            new Weapon("BattleAxe"),
            new Weapon("LongSword"),
            new Weapon("Spear"),
            new Weapon("Nadachi"),
            new Weapon("Ohmlatl")
    );
    static private List<Weapon> rangedWeapon = Arrays.asList(
            new Weapon("Bow"),
            new Weapon("CrossBow"),
            new Weapon("Kunai"),
            new Weapon("Shurikens"),
            new Weapon("Gun"),
            new Weapon("DoubleGun"),
            new Weapon("ShortGun")
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
