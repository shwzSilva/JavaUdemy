package java_basico;

import java.util.Scanner;

public class Output {
    public static void main(String[] args){
        //1. Hello and Name Printer
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = sc.next();

        System.out.println("Hello, " + name);

    }
}
