package fundamentals;

import java.util.Scanner;

public class section15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        String resposta;
        int x, soma=0;
        do{
            System.out.println("Digite um numero: ");
            x = sc.nextInt();
            soma += x; // ou s = s + x;
            System.out.println("Deseja digitar mais numeros a soma? (S/N)");
            resposta = sc.next();
        }while(resposta.equals("s")); // .equals compara se S e = a S

        System.out.println("A soma de todos os valores e = " + soma);
*/
        int num, soma =0;
        char resposta;
        do{
            System.out.println("Digite um numero: ");
            num = sc.nextInt();
            soma += num;
            System.out.println("Quer adicionar mais um numero a soma? (s/n)");
            resposta = sc.next().charAt(0); // resposta armazena o caractere na posição 0 e compara se e = a 's'
        } while(resposta == 's');

        System.out.println("A soma de todos os valores e = " + soma);
        sc.close();
    }
}
