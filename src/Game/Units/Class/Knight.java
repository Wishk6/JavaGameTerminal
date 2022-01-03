package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

import java.util.Arrays;

public class Knight extends Character {
    public Knight(String _name) {
        super(_name, 600, 50,30, "Character", 0, 0,
                Arrays.asList("J'attaque et je suis un chevalier",
                        "Je me def et je suis un chevalier",
                        "Je meuuuuurs et je suis un chevalier")
        );
        weapons.addAll(WeaponList.getOneHandedWeapon());
    }
}
