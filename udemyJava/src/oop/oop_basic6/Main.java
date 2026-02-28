package oop.oop_basic6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do produto: ");
        double preco = sc.nextDouble();

        Produto p1 = new Produto(nome, preco);

        System.out.println("Produto: " + p1.getNome());
        System.out.printf("Preço: %.2f%n", p1.getPreco());

        sc.close();
    }
}
