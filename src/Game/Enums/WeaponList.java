package Game.Enums;

import Game.Items.BlazingArrow;
import Game.Items.IArme;
import Game.Items.Weapon;

import java.util.Arrays;
import java.util.List;

public class WeaponList {
    static private List<IArme> magicalWeapon = Arrays.asList(
            new Weapon("Tome", 15 , 1, 4),
            new Weapon("Wand", 13 , 1, 6),
            new Weapon("Staff", 12 , 1, 2),
            new Weapon("Orb", 10 , 1, 4),
            new Weapon("Lyre", 10 , 1, 3),
            new Weapon("Glove", 20 , 1, 1),
            new Weapon("GemStone", 10 , 1, 3)
    );
    static private List<IArme> oneHandedWeapon = Arrays.asList(
            new Weapon("Katana", 20 , 1, 1.5f),
            new Weapon("Sword", 20 , 1, 1),
            new Weapon("ShieldSword", 20 , 1, 1),
            new Weapon("Axe", 20 , 1, 1.5f),
            new Weapon("DoubleAxe", 20 , 1, 1),
            new Weapon("DoubleDagger", 20 , 1, 1),
            new Weapon("Flail", 20 , 1, 2),
            new Weapon("GemStone", 10 , 1, 3)
    );
    static private List<IArme> twoHandedWeapon = Arrays.asList(
            new Weapon("WarHammer", 20 , 0.95f, 1),
            new Weapon("BattleAxe", 18 , 0.89f, 1),
            new Weapon("LongSword", 15 , 1, 1.5f),
            new Weapon("Spear", 15 , 0.89f, 3),
            new Weapon("Nadachi", 12 , 1, 2),
            new Weapon("Ohmlatl", 15 , 0.9f, 1.5f),
            new BlazingArrow()
    );

    static private List<IArme> rangedWeapon = Arrays.asList(
            new Weapon("Bow", 10 , 1, 6),
            new Weapon("CrossBow", 10 , 1, 6),
            new Weapon("Kunai", 10 , 1, 5),
            new Weapon("Shurikens", 10 , 1, 5),
            new Weapon("Gun", 10 , 1, 5),
            new Weapon("DoubleGun", 10 , 1, 4),
            new Weapon("ShortGun", 10 , 1, 3),
            new Weapon("MagicBow", 150 , 0.05f, 6)
    );


    public static List<IArme> getMagicalWeapon(){
        return magicalWeapon;
    }
    public static List<IArme> getRangedWeapon(){
        return rangedWeapon;
    }
    public static List<IArme> getOneHandedWeapon(){
        return oneHandedWeapon;
    }
    public static List<IArme> getTwoHandedWeapon(){
        return twoHandedWeapon;
    }
}
