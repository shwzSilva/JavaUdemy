package oop.oop_basic3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            Produto p1 = new Produto();
            System.out.println("Digite o nome do produto: ");
            String lerNome = sc.nextLine();
            p1.setNome(lerNome);

            System.out.println("Digite o valor do produto: R$");
            double lerValor = sc.nextDouble();
            p1.setValor(lerValor);

            p1.status();

        sc.close();
    }
}
