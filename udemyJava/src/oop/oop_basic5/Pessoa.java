package oop.oop_basic5;

public class Pessoa {
    public String nome;
    public int idade;

    public void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    public void apresentar(){
        System.out.println("Olá meu nome é " + nome);
        System.out.println("Tenho "+ idade + " anos.");
    }
}
