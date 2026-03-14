package oop.oop_basic8;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[3];
        livros[0] = new Livro("A metamorfose", "Franz Kafka", 19.90);
        livros[1] = new Livro("Noites Brancas", "Fiodor Dostoievski", 23.80);
        livros[2] = new Livro("De quanta terra precisa um homem?", "Liev Tolstoi", 12.90);

        livros[0].mostrarInfo();
        livros[1].mostrarInfo();
        livros[2].mostrarInfo();
    }
}
