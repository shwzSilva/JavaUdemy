package aulas_poo.aula03;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite o valor dos lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor dos lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triângulo X e: %.2f%n", areaX);
        System.out.printf("A area do triângulo Y e: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("A area do triângulo X e maior");
        } else {
            System.out.println("A area do triângulo Y e maior");
        }

    }
}
