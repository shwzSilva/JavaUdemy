package projetos.ufc;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[5];

        lutador[0] = new Lutador("Anderson Spider Silva","Brasil", 30, 1.79, 85.7, 23, 4, 1);

        lutador[0].apresentar();
        lutador[0].ganharLuta();

        lutador[0].status();
    }
}
