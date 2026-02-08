package fundamentals;

import java.util.Scanner;

public class section12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.printf("Equivalente em fahrenheit:%.1f%n", f);

            System.out.println("Deseja repetir? (s/n)");
            resposta = sc.next().charAt(0);
        } while(resposta == 's');

        sc.close();
    }
}
