import Game.Character;
import Game.WeaponType;


public class Main {
    public static void main(String[] args)
    {
        Character Nanaka = new Character("Nanaka", WeaponType.ShieldSword);
        Character Jaetan = new Character("Jaetan", WeaponType.Bow);
        Character XFactors = new Character("XFactors", WeaponType.Staff);
        Character Wishk = new Character("Wishk", WeaponType.LongSword);


        //Combat Jaetan Nanaka Dart vs LUA\\

        System.out.println("Bienvenue ce soir dans le combat qui opposera C# et Dart.\nC# sera représenté par Nanaka.\nDart sera représenté par Jaetan.");
        while(Jaetan.isDead() || Nanaka.isDead())
        {


        }
    }
}
