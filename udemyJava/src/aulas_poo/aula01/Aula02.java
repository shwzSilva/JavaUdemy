package aulas_poo.aula01;

public class Aula02 {
    public static void main(String[] args){
        /*
        Caneta canetaAzul = new Caneta();
            canetaAzul.cor = "Azul";
            canetaAzul.carga = 100;
            canetaAzul.modelo = "Bic";
            canetaAzul.ponta = 1.5;

            canetaAzul.tampada();
            canetaAzul.status();
            canetaAzul.rabiscar();

            System.out.println(" ");

        Caneta canetaVermelha = new Caneta();
            canetaVermelha.cor = "Vermelha";
            canetaVermelha.carga = 50;
            canetaVermelha.modelo = "FaberCastel";
            canetaVermelha.ponta = 1.0;

            canetaVermelha.destampar();
            canetaVermelha.status();
            canetaVermelha.rabiscar();
*/
        Garrafa garrafa_stanley = new Garrafa();

            garrafa_stanley.modelo = "Stanley";
            garrafa_stanley.cor = "Preta";
            garrafa_stanley.qtdMl = 800;

            garrafa_stanley.status();
            garrafa_stanley.destampar();
            garrafa_stanley.beber();

    }
}
