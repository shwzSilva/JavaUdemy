package desafios_beecrowd;
import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = ((A*2.0) + (B*3.0) + (C*5.0)) / 10.0;
        System.out.printf("MEDIA = %.1f%n" , media);
    }
}
