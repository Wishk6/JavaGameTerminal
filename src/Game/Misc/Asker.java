package Game.Misc;

import java.util.List;
import java.util.Scanner;

public class Asker {
    public static int askChoice(List<String> choices, String question) {
        int result = 0;

        println(question);

        for(int i = 0; i < choices.size(); i++){
            println(i+1 + ". " + choices.get(i));
        }

        while (result <= 0 || result > choices.size()){
            try {
                result = Integer.parseInt(scanner());
            }catch (Exception e){
                result = 0;
            }
        }

        clear();
        return result;
    }

    public static String askEntry(String question){
        String result = "";
        boolean confirmed = false;



        while (!confirmed){
            println(question);
            result = scanner();
            confirmed = confirmChoice();
        }

        clear();
        return result;
    }

    private static boolean confirmChoice(){
        boolean result = false;
        String val = "";

        while (!val.equals("o") && !val.equals("O") && !val.equals("n") && !val.equals("N")){
            println("Are you sure ? (O/N)");
            val = scanner();
            if (val.equals("o") || val.equals("O")) result = true;
        }
        return result;
    }

    private static String scanner(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        return scan.nextLine();
    }

    public static void println(String val){
        System.out.println(val);
    }

    public static void clear(){
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
        println("");
    }
}
