package oop.oop_basic2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria you = new ContaBancaria();

        System.out.print("Digite o seu nome: ");
        you.tiular = you.sc.next();

        System.out.print("Digite o valor atual na sua conta: R$");
        you.saldo = you.sc.nextDouble();

        you.mostrarSaldo();
        you.sacar();
        you.mostrarSaldo();
    }
}
