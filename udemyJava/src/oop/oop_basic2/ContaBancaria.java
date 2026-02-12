package oop.oop_basic2;
import java.util.Scanner;

public class ContaBancaria {
    Scanner sc = new Scanner(System.in);
    public String tiular;
    public double saldo = 0;

    public void depositar(){
        System.out.print("Digite o valor que deseja depositar: R$");
        double valorDoDeposito  = sc.nextDouble();
        saldo += valorDoDeposito;
    }
    public void sacar(){
        System.out.println("Digite o valor que deseja sacar: R$");
        double saque = sc.nextDouble();
            if(saque > saldo){
                System.out.println("Valor na sua conta: R$"+ saldo + ", Você precisa depositar um valor primeiro!");
            } else {
                saldo = saldo - saque;
                System.out.printf("Você sacou R$%.2f%n", saque);
            }
    }
    public void mostrarSaldo(){
        System.out.printf("O seu saldo atual e de R$%.2f%n", saldo);
    }
}
