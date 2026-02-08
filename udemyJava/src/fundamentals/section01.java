package fundamentals;

import java.util.Scanner;

public class section01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
            int senha = sc.nextInt();

            while (senha != 2002){
                System.out.println("Senha invalida!");
                senha = sc.nextInt();
            }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
