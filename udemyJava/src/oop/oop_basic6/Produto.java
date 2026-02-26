package oop.oop_basic6;

public class Produto {
    private String nome;
    private double preco;

    public void Produto(String nome, double preco){
        this.nome = nome;
        if (preco > 0){
            this.preco = preco;
        }
    }


}
