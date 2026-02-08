package fundamentals;

import java.util.Scanner;

public class section02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //abscissas = x
        //ordenadas = y

        int x = sc.nextInt();
        int y = sc.nextInt();

            while (x != 0 && y != 0){
                if (x > 0 && y > 0){
                    System.out.println("Primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("Segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("Terceiro");
                } else {
                    System.out.println("Quarto"); //abscissas e ordenadas negativas = o terceiro quadrante
                }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
