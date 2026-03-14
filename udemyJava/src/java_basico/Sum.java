package java_basico;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
            for(int i= 0; i < 2; i++){
                System.out.println("Write the number for sum: ");
                int num = sc.nextInt();
                sum += num;
            }
        System.out.println("the result of the sum is: " + sum);
    }
}
