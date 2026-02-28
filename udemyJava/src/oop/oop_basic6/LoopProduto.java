package oop.oop_basic6;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Produto> produtos = new ArrayList<>();

        System.out.print("Digite quantos produtos deseja cadastrar: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < qtd; i++){
            System.out.println("\nProduto " + (i +1));

            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite o valor do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // limpa o buffer

            Produto produto = new Produto(nome, preco);
            produtos.add(produto);
        }
        System.out.println("--- \nLISTA DE PRODUTOS ---");

        for(Produto p: produtos){
            System.out.println("Produto: " + p.getNome());
            System.out.printf("Preço: %.2f%n", p.getPreco());
            System.out.println("\n");
        }
        sc.close();
    }
}
