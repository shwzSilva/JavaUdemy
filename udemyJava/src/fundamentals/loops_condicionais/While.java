//Usando while, leia números até que o usuário digite 0.

package fundamentals.loops_condicionais;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Acerte o numero: ");
        int num = sc.nextInt();

        while( num !=0){
            System.out.println("Numero errado, tente novamente: ");
            num = sc.nextInt();
        }
        System.out.println("Você acertou! :" + num);
        sc.close();
    }
}
