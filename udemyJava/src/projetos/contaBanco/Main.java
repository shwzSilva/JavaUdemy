package projetos.contaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco("CC");

        System.out.print("Digite o seu nome: ");
        conta.setDono(sc.next());

        System.out.print("Digite o numero da conta: ");
        conta.setNumConta(sc.nextInt());
        conta.abrirConta();

        conta.depositar();
        conta.sacar();

        conta.statusUser();
        sc.close();
    }
}
