package aulas_poo.aula02;

public class Aula03 {
    public static void main(String[] args){
        Carro uno = new Carro();
        uno.modelo = "Fiat";
        uno.cor = "Branco";
        uno.anoDoModelo = 2001;
        //uno.combustivel = "Flex";
        //uno.kmRodado = 0.5f;
        //uno.motor = "1.0";

        uno.desligar();
        uno.andar();



    }
}
