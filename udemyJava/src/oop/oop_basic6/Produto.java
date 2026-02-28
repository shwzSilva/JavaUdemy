package oop.oop_basic6;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }else {System.out.println("Não e possivel colocar um valor negativo");}
    }
    public double getPreco() {
        return preco;
    }
}
