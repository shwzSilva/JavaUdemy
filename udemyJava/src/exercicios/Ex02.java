package exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, inputNum = 0;

        while(inputNum != 1){
            System.out.println("Digite um numero: ");
            inputNum = sc.nextInt();
            soma += inputNum;
        }

        System.out.println("Você acertou!!");
        System.out.println("Soma dos valores digitados: " + soma);

        sc.close();
    }
}
