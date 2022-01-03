package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

import java.util.Arrays;

public class Barbarian extends Character {
    public Barbarian(String _name) {
        super(_name, 500, 75, 25, "Character", 0, 0,
                Arrays.asList("A l'ATTAQUE !!",
                        "*Cri du barbare qui souffre*",
                        "Amenez moi au Valhalla..")
        );

        weapons.addAll(WeaponList.getTwoHandedWeapon());
    }
}
