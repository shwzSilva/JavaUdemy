package desafios_beecrowd;
import java.util.Scanner;

public class Salario_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double salarioHora = sc.nextDouble();

        double salarioTotal = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salarioTotal);
    }
}
