package projetos.ufc;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[5];

        lutador[0] = new Lutador("Anderson Spider Silva","Brasil", 30, 1.79, 85.7, 23, 4, 1);
        lutador[1] = new Lutador("MinoTauro", "Brasil", 32, 1.82, 87.0, 22, 1, 3);

        Luta ufc = new Luta();

        ufc.marcarLuta(lutador[0], lutador[1]);
        ufc.lutar();

    }
}
