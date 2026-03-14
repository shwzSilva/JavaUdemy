package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int inputNum = sc.nextInt();

        for(int i =1; i <= 10; i++){
           int x = inputNum * i;
            System.out.println(inputNum + " x " + i + " = " + x);
        }


        sc.close();
    }
}
