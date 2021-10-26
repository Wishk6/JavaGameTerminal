package Game.Items.Equipments;

import Game.Enums.WeaponClass;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.List;

public class Weapon {
    WeaponClass weaponClass;
    String weapon;

    public Weapon(WeaponClass _weaponClass, String _weapon){
        weaponClass = _weaponClass;
        weapon = _weapon;
    }
    public Weapon(String _weapon){
        weapon = _weapon;
    }

    public String getName(){
        return weapon;
    }

    public WeaponClass getWeaponClass(){
        return weaponClass;
    }
}
