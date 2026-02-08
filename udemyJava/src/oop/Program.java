package oop;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Digite o valor dos lados do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite o valor dos lados do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double result = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(result *(result - xA) * (result - xB) * (result - xC));

        result = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(result *(result - yA) * (result - yB) * (result - yC));

        System.out.printf("A area do triângulo X e: %.2f%n", areaX);
        System.out.printf("A area do triângulo Y e: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("A area do triângulo X e maior");
        } else {
            System.out.println("A area do triângulo Y e maior");
        }

    }
}
