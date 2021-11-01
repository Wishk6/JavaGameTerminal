package Game.Enums;

import Game.Items.Weapon;

import java.util.Arrays;
import java.util.List;

public class WeaponList {
    static public List<Weapon> magicalWeapon = Arrays.asList(
            new Weapon("Tome"),
            new Weapon("Wand"),
            new Weapon("Staff"),
            new Weapon("Orb"),
            new Weapon("Lyre"),
            new Weapon("Glove"),
            new Weapon("GemStone")
    );
    static public List<Weapon> oneHandedWeapon = Arrays.asList(
            new Weapon("Katana"),
            new Weapon("Sword"),
            new Weapon("ShieldSword"),
            new Weapon("Axe"),
            new Weapon("DoubleAxe"),
            new Weapon("DoubleDagger"),
            new Weapon("Flail")
    );
    static public List<Weapon> twoHandedWeapon = Arrays.asList(
            new Weapon("WarHammer"),
            new Weapon("BattleAxe"),
            new Weapon("LongSword"),
            new Weapon("Spear"),
            new Weapon("Nadachi"),
            new Weapon("Ohmlatl")
    );
    static public List<Weapon> rangedWeapon = Arrays.asList(
            new Weapon("Bow"),
            new Weapon("CrossBow"),
            new Weapon("Kunai"),
            new Weapon("Shurikens"),
            new Weapon("Gun"),
            new Weapon("DoubleGun"),
            new Weapon("ShortGun")
    );
}
