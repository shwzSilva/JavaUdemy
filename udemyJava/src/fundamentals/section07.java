package fundamentals;

import java.util.Scanner;

public class section07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            a = a *2;
            b = b * 3;
            c = c * 5;

            double soma = (a + b + c) / 10; //Média ponderada
            System.out.printf("%.1f%n",soma);
        }
        sc.close();
    }
}
