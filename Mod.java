public class Mod {

    private static int mod;
    public static int calcMod(int atr) {
        mod = 0;
        if(atr > 18) {
            mod += 5;
        }
        else
            if (atr > 10 && atr <= 18){
                mod += 3;
            }
        else
            if (atr > 3 && atr <= 10) {
                mod -= 1;
            }
        return mod;
    }
}
