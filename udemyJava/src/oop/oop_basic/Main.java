package oop.oop_basic;

public class Main {
    public static void main(String[] args) {
        Pessoa you = new Pessoa();
        Pessoa me = new Pessoa();

        you.nome = "Jhon";
        you.idade = 20;

        me.nome = "Cenna";
        me.idade = 20;

        you.apresentar();
        me.apresentar();
    }
}
