import Game.Character;
import Game.Weapon;

public class Main {
    public static void main(String[] args)
    {
        Character Nanaka = new Character("Nanaka");
        Character Jaetan = new Character("Jaetan");
        Character XFactors = new Character("XFactors");
        Character Wishk = new Character("Wishk");


        //Combat Jaetan Nanaka Dart vs C#\\
        while(Jaetan.isDead() || Nanaka.isDead())
        {

            Nanaka.Attack(Jaetan);

        }
    }
}
