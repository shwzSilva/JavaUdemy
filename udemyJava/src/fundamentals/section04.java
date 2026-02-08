package fundamentals;

import java.util.Scanner;

public class section04 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
/*
        int n = sc.nextInt();
        int soma = 0;

        for (int i =0; i < n; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
*/

/*
        System.out.println("Contagem regressiva: ");
        int contador = sc.nextInt();

        for(int i=0; contador >= i; contador--){
             System.out.println(contador);
        }
*/
/*
        System.out.println("Contagem crescente: ");
        int N = sc.nextInt();

        for( int i=0; i <= N; i++){
            System.out.println(i);
        }
*/
        int x = 10;
        int y = 0;

        for (int i =0; i <= x ; i++){
            System.out.print(i + ",");
            y = y + 5;
            System.out.println(y);
        }

        sc.close();
    }
}
