package oop.oop_basic5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa ps1 = new Pessoa();
        Pessoa ps2 = new Pessoa();

        ps2.nome = "Rafael";
        ps2.idade = 31;

        System.out.print("Digite o seu nome: ");
        ps1.nome = sc.next();
        System.out.print("Digite a sua idade: ");
        ps1.idade = sc.nextInt();

            ps1.dadosPessoais();

            ps2.dadosPessoais();
            ps2.apresentar();

        sc.close();
    }
}
