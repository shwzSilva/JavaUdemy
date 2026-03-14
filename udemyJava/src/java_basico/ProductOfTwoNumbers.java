package java_basico;
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numF, numS, result;

        numF = sc.nextInt();
        numS = sc.nextInt();

        result = numF * numS;
        System.out.println(result);
    }
}
