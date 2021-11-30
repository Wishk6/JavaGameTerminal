package Game.Items;

import java.util.ArrayList;

public class WeaponBag extends ArrayList<IArme> {
    private ArrayList<IArme> weapons = new ArrayList<IArme>();
    private float volume;
    private float weight;

    public WeaponBag() {}

    public void Bag(ArrayList<IArme> weapons) {
        this.weapons = weapons;
    }

    public void addToBag(IArme weapon) {
        this.weapons.add(weapon);
    }
}
