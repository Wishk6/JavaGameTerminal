import Game.Units.Character;
import Game.Enums.WeaponClass;


public class Main {
    public static void main(String[] args)
    {
        Character Nanaka = new Character("Nanaka", WeaponClass.ShieldSword);
        Character Jaetan = new Character("Jaetan", WeaponClass.Bow);
        Character XFactors = new Character("XFactors", WeaponClass.Staff);
        Character Wishk = new Character("Wishk", WeaponClass.LongSword);


        //Combat Jaetan Nanaka Dart vs LUA\\

        System.out.println("Bienvenue ce soir dans le combat qui opposera C# et Dart.\nC# sera représenté par Nanaka.\nDart sera représenté par Jaetan.");
        while(Jaetan.isDead() || Nanaka.isDead())
        {


        }
    }
}

