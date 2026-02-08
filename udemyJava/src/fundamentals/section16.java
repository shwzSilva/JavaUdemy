package fundamentals;

import java.util.Scanner;

public class section16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        for(int i=0; i <= 100; i+= 10){
            System.out.println(i);
        }
*/
        int i,j;
        for ( i = 0; i <=3; i++) {
            System.out.print(i + " ");
            for (j = 0; j <= 2; j++) {
                System.out.print(j);
            }
        }
    }
}
