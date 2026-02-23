package fundamentals.loops_condicionais;

import java.util.Scanner;

public class While_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorInput = 0;
        int soma = 0;

        while(valorInput != -1){
            System.out.print("Adivinhe o numero: ");
            valorInput = sc.nextInt();
            if (valorInput != -1){
                soma += valorInput;
            }
        }


        System.out.println("Você acertou!!");
        System.out.println("Soma dos numeros que você digitou: " + soma);
        sc.close();
    }
}
