package java_basico;
import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numF, numS, div;

        numF = sc.nextInt();
        numS = sc.nextInt();
        div = numF / numS;

        System.out.printf("%.2f%n",div);
    }
}
