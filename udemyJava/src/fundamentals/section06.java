package fundamentals;

import java.util.Scanner;

public class section06 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int out = 0;
        int in = 0;

            for (int i =0; i < N; i++ ){
                int x = sc.nextInt();
                    if (x >= 10 && x <= 20){
                        in++;
                    } else{
                        out++;
                    }
            }

        System.out.println("In: " + in);
        System.out.println("Out: " + out);

        sc.close();
    }
}