package fundamentals;

import java.util.Scanner;

public class section03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alcool, gasolina, diesel, tipo;

        System.out.println("Você tem preferência por qual desses combustiveis: ");
        System.out.println("----- Digite 1 para Alcool     ----");
        System.out.println("----- Digite 2 para Gasolina   ----");
        System.out.println("----- Digite 3 para Diesel     ----\n");
        System.out.println("----- Digite 4 para concluir   ----");

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        tipo = sc.nextInt();

        while(tipo != 4) {
            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}