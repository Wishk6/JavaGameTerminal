package Game.Items;

public interface IWeapon {    // le sac pèse 10 est une arme pèse 1
    String getName();
    int getUsure();
    int getDamage();
    int getPrecision();
    int getRange();
    //int getWeight();
    //void repair(float percent);
    //boolean isEquipped();
    // void attack(IPersonnage);
}
