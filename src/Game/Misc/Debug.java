package Game.Misc;

public class Debug {
    static private boolean debugActive = false;
    static public void activate(){
        debugActive = true;
    }

    static public void println(String val){
        if(debugActive){
            Asker.clear();
            Asker.println("DEBUG");
            Asker.println(val);
        }
    }
}
