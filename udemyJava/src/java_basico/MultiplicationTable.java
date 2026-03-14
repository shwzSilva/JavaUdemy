package java_basico;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, x;
        num = sc.nextInt();

        for(int i=1; i <= 10; i++){
            x = num *i;
            System.out.println(num+ " x "+ i +" = " + x);
        }
    }
}
