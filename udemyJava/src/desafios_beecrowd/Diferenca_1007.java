package desafios_beecrowd;
import java.util.Scanner;

public class Diferenca_1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int [4];

        for(int i =0; i <= 3; i++){
            valores[i] = sc.nextInt();
        }
        int diferenca = (valores[0] * valores[1] - valores[2] * valores[3]);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
