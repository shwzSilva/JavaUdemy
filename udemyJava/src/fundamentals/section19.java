package fundamentals;

public class section19 {
    public static String contador (int inicio, int fim){
        String s = "";
        for(int c = inicio; c <= fim; c++){
            s += c + " ";
        }
        return s;
    }
}
