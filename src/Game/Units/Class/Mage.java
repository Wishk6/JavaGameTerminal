package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;
import java.util.Arrays;

public class Mage extends Character {

    public Mage(String _name) {
        super(_name, 250, 150, 15, "Character", 0, 0,
                Arrays.asList("J'attaque et je suis un mage",
                        "Je me def et je suis un mage",
                        "Je meuuuuurs et je suis un mage")
        );
        weapons.addAll(WeaponList.getMagicalWeapon());
    }
}
