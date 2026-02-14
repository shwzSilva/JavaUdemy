//Usando do while, peça uma senha até que seja correta.
package fundamentals.loops_condicionais;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 12345678;
        int senha;
        do {
            System.out.println("Digite a senha correta: ");
            senha = sc.nextInt();
        }while(senha != senhaCorreta);

        System.out.println("Acesso liberado!");
    }
}
