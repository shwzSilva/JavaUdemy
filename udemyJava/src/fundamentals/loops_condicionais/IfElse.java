//Use if / else if / else para classificar uma nota (A, B, C, D ou F).
package fundamentals.loops_condicionais;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = sc.nextInt();
            if(nota >= 9){
                System.out.println("NOTA: A");
            } else if (nota >= 7 && nota < 9 ) {
                System.out.println("NOTA: B");
            }else if (nota >= 5 && nota < 7 ) {
                System.out.println("NOTA: C");
            }else if (nota >= 3 && nota < 5 ) {
                System.out.println("NOTA: D");
            }else if (nota >= 0 || nota < 2 ) {
                System.out.println("NOTA: F");
            }
    }
}
