package fundamentals;

import java.util.Scanner;

public class section05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i=0; i <= x; i++){
            if ( i%2 != 0){ //Se colocar i%2 == 0 você terá números pares..
                System.out.println(i);
            }
        }
    }
}
