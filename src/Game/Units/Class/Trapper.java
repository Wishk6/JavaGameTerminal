package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

import java.util.Arrays;

public class Trapper extends Character {
    public Trapper(String _name) {
        super(_name, 125, 300, 15, "Character", 0, 0,
                Arrays.asList("J'attaque et je suis un chasseur",
                        "Je me def et je suis un chasseur",
                        "Je meuuuuurs et je suis un chasseur ")
        );
        weapons.addAll(WeaponList.getRangedWeapon());
    }
}
