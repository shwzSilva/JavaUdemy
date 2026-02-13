package oop.oop_basic3;
public class Produto {

    private String nome;
    private double valor;

    public void getNome(){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getValor(){
        this.valor = valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public void status(){
        System.out.println("PRODUTO: " + nome);
        System.out.printf("VAlOR: R$%.2f%n", valor);

    }
}
