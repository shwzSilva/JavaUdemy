package fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//O objetivo é calcular o total a pagar com base na fórmula:
//(quantidade1 × valor_unitário1) + (quantidade2 × valor_unitário2)
//
//O resultado deve ser impresso com a mensagem VALOR A PAGAR: R$ seguido do valor com duas casas decimais.
public class section20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        int qtd1, qtd2;
        double valor1, valor2;

        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);
        System.out.printf("Valor total: %.2f%n",total);
*/
/*
        double[] valor = new double [2];
        for(int c=0; c < 2; c++){
            System.out.println("Digite a quantidade do produto: ");
            int qtd1 = sc.nextInt();
            System.out.println("Digite o valor do produto: ");
            double valor1 = sc.nextInt();

            valor[c] = (qtd1 * valor1);
        }
        double result = Arrays.stream(valor).sum();
        System.out.printf("Valor total: %.2f%n", result);

*/
        char resposta;
        double valorTotal = 0;

        do{
            System.out.println("Digite a quantide do produto: ");
            int qtd1 = sc.nextInt();
            System.out.println("Digite o valor do produto");
            double valor = sc.nextDouble();

            valorTotal += qtd1 * valor;

            System.out.printf("Valor total: %.2f%n",valorTotal);
            System.out.println("Deseja adicionar mais produtos? (S/N)");
            resposta = sc.next().charAt(0);

        }while(resposta == 's');

        System.out.printf("Valor total a pagar: %.2f%n",valorTotal);
        sc.close();
    }
}
